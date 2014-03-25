$(function() {
    $.contextMenu({
        selector: '#scene .item', 
        trigger: 'left',
        build: function($trigger, e) {
            var itemId = $trigger[0].id;
            var inventoryItemId = $("#inventory").data('picker').select[0].value;
            
            // set title
            $('.context-menu-list').prepend("Hello");
            
            var menu = {
                callback: function(key, options) {
                    var m = "clicked: " + key;
                    
                    if(item[itemId].hasOwnProperty("actions") && item[itemId].actions.hasOwnProperty(key)){
                        var action = item[itemId].actions[key];
                        
                        if(action.hasOwnProperty("requires") && action.requires !== inventoryItemId){
                            if(action.alt_message){
                                show_message(itemId,action.alt_message);
                            }
                        }else{
                                if(action.hasOwnProperty("remove")){
                                    $.each(action["remove"], function(index, value){
                                        remove_item_from_scene(currentSceneId, value);
                                        remove_item_from_inventory(value);
                                    });
                                }

                                if(action.hasOwnProperty("add")){
                                    $.each(action['add'], function(index, value){
                                        add_item_to_scene(currentSceneId, value);
                                    });
                                }
                            
                                if(action.hasOwnProperty("message")){
                                    show_message(itemId, action.message);
                                }

                                if(action.hasOwnProperty("scene")){
                                    show_scene(action.scene);
                                }
                        }
                        
                    }else if(key === "pick-up"){
                        pick_up_item(itemId);
                    }else if(key === "talk-to"){
                        talk_to(itemId);
                    }else{
                        window.console && console.log(m) || alert(m); 
                    }
                },
                items: {
                    
                }
            };
            
            if(item[itemId].hasOwnProperty('dialog')){
                menu.items["talk-to"] = {name: "talk to"};
            }
            
            
            if(item[itemId].canPickUp){
                menu.items["pick-up"] = {name: "pick up"};
            }
            
            if(item[itemId].actions){
                $.each(item[itemId].actions, function(name, property) {
                    if(inventoryItemId !== ""){
                        menu.items[name] = {name: name + " with " + inventoryItemId}; 
                    }else{
                        menu.items[name] = {name: name}; 
                    }
                });
            }
            
            return menu;
        }
    });
});
