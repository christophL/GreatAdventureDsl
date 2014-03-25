var currentSceneId = "";
var inventory = [];

function start_game(){
    $( "#dialog" ).dialog({ autoOpen: false, width:'auto' });
    
    // show start scene
    show_scene(startSceneId);
    
    // add items to inventory
    $.each(initialInventory, function( index, itemId ) {
        add_to_inventory(itemId);
    });

    currentSceneId = startSceneId;

    // set page title
    document.title = adventureName;
}

function remove_item_from_scene(sceneId, itemId){
    // from view
    if(sceneId === currentSceneId){
        $("#" + itemId).remove();
    }
    
    // from data
    scene[sceneId].items.splice($.inArray(itemId, scene[sceneId].items),1);
}

function remove_item_from_inventory(itemId){
    // from view
    $("#" + itemId).remove();
    
    // from data
    inventory.splice($.inArray(itemId, inventory), 1);
 
    // reinitalize image picker
    $("#inventory").imagepicker({limit: 1});
}

function add_to_inventory(itemId){
    // view
    $("#inventory").append("<option data-img-src='" + item[itemId].image + "' value='" + itemId + "' id='" + itemId + "'>");
                    
    // reinitalize image picker
    $("#inventory").imagepicker({limit: 1});
    
    // data
    inventory.push(itemId);
}

function add_item_to_scene(sceneId, itemId){
    // view
    if(sceneId === currentSceneId){
        $("#scene").append(
            '<div id="' + itemId + '" class="item" style="top:'+ item[itemId].posy + 'px; left:'+ item[itemId].posx + 'px;">'
                +'<img src="' + item[itemId].image + '">'
            +'</div>'
        );
        setupItemHover();
    }
    
    // data
    scene[sceneId].items.push(itemId);
}

function pick_up_item(itemId){                
    remove_item_from_scene(currentSceneId, itemId);                
    add_to_inventory(itemId);
}

function show_scene(sceneId){
    // remove objects from old scene
    $("#scene").empty();
    
    // show background
    $("#scene").css('background', 'url(' + scene[sceneId].image + ')');
    
    // show objects
    $.each(scene[sceneId].items, function( index, itemId ) {
        $("#scene").append(
            '<div id="' + itemId + '" class="item" style="top:'+ item[itemId].posy + 'px; left:'+ item[itemId].posx + 'px;">'
                +'<img src="' + item[itemId].image + '">'
            +'</div>'
        );
    });
    $("#scene").append();
    
    setupItemHover();
} 
        
function setupItemHover(){
    $("#scene .item").unbind('mouseenter mouseleave');
    
    $("#scene .item").hover(
        function(){                
            if($(this).attr('id') !== 'image-colorizer'){
                $(this).append(
                    '<div id="image-colorizer" style="height:' + $(this).height() + 'px; width:' + $(this).width() + 'px;"></div>'
                );
                $('#image-colorizer').corner("30px");
            }
        },
        function(){
            if($(this).attr('id') !== 'image-colorizer'){
                $('#image-colorizer').remove();
            }
        }
    );
}

function show_talk_dialog(itemId){
    if(!item[itemId].hasOwnProperty('dialog')){
        console.log('no dialog found for ' + itemId);
        return;
    }
    
    // restore dialog status
    var dialog = item[itemId]['dialog'];
    if(item[itemId].hasOwnProperty('dialogHistory')){
        for(var answerId in item[itemId]['dialogHistory']){
            dialog = dialog['answers'][item[itemId]['dialogHistory'][answerId]];
        }
    }
    
    if(dialog.hasOwnProperty("remove")){
        $.each(dialog["remove"], function(index, value){
            remove_item_from_scene(currentSceneId, value);
            remove_item_from_inventory(value);
        });
    }

    if(dialog.hasOwnProperty("add")){
        $.each(dialog['add'], function(index, value){
            add_item_to_scene(currentSceneId, value);
        });
    }

    if(dialog.hasOwnProperty("reset") && dialog['reset']){
        item[itemId]['dialogHistory'] = [];
    }
    
    if(dialog.hasOwnProperty("scene")){
        show_scene(dialog.scene);
    }
    
    if(dialog.hasOwnProperty("say") || dialog.hasOwnProperty("answers")){
        // draw dialog
        $('#dialog').empty();

        $('#dialog').dialog('option', 'title', itemId);

        if(dialog.hasOwnProperty("say")){
            $('#dialog').append('<p>' + dialog.say + '<p>');
        }

        if(dialog.hasOwnProperty('answers')){
            var selectionHTML = '<select id="dialog-answer">';
            for(var answer in dialog.answers){
                selectionHTML +='<option>' + answer + '</option>';
            }
            selectionHTML += '</select>';
            $('#dialog').append(selectionHTML);

            $('#dialog').append('<input id="dialog-button" type="button" value="answer" onclick="talk_answer(\''+itemId+'\');" />');
        }else{
            $('#dialog').append('<input id="dialog-button" type="button" value="ok" onclick="$(\'#dialog\').dialog(\'close\');" />');
        }
         
        $( "#dialog" ).dialog("open");
    }
}

// click on "talk to"
function talk_to(itemId){
    show_talk_dialog(itemId);
}

function talk_answer(itemId){
    var answer = $('#dialog-answer').val();
    
    
    
    if(item[itemId].hasOwnProperty('dialogHistory')){
        item[itemId].dialogHistory.push(answer);
    }else{
        item[itemId]['dialogHistory'] = [answer];
    }
    
    show_talk_dialog(itemId);
}

function show_message(itemId, message){
    $('#dialog').empty();

    $('#dialog').dialog('option', 'title', itemId);  
    $('#dialog').append('<p>' + message + '<p>');
    $('#dialog').append('<input id="dialog-button" type="button" value="ok" onclick="$(\'#dialog\').dialog(\'close\');" />');
    $( "#dialog" ).dialog("open");
}