var startSceneId = "house";
var initialInventory = ["key"];
var adventureName = "The Great Adventure";

var scene = {
    "house": {
        image: "http://4.bp.blogspot.com/-12bmIPR3V-0/Tk2n6WI_yzI/AAAAAAAAC1o/a8Fzjqq4nDU/s1600/Armada_House_Bonjourlife.com_1.jpg",
        items: ["lamp", "cup", "coffee", "door"]
    },
    "kitchen": {
        image: "http://hgtv.sndimg.com/HGTV/2011/12/02/HGTV_hdivd1310-kitchen-after-Crop_s4x3.jpg",
        items: ["empty_cup"]
    }
};

var item = {
    "lamp": {
        image: "http://img.hsmagazine.net/2012/12/lamp-of-the-inferno.png",
        canPickUp: false,
        posx: 300,
        posy: 300,
        actions: {
            "kick the lamp": { message: 'Outch...<img src="http://www.freesmileys.org/smileys/smiley-angry019.gif">' },
            "rub the lamp": {add: ["djinni"], remove: ["lamp"] },
        }
    },
    "magic fork": {
        image: "http://i.imgur.com/bbNRs.png",
        canPickUp: false,
        posx: 100,
        posy: 300,
        actions: {
            "rub the fork": { add: ["coffee"], remove: ["coffee"] }
        }
    },
    "cup": {
        image: "http://www.rockiesventureclub.org/wp-content/uploads/2012/06/cup-coffee-icon.png",
        canPickUp: false,
        posx: 200,
        posy: 0,
        actions: {
            "drink": { add: ["empty_cup"], remove: ["cup"], message: "Yummy coffee." }
        }
    },
    "empty_cup": {
        image: "http://ecx.images-amazon.com/images/I/31nMJoEo9aL._SL75_SS50_.jpg",
        canPickUp: false,
        posx: 200,
        posy: 0,
        actions: {
            "make coffee": { requires: "coffee", add: ["cup"], remove: ["empty_cup", "coffee"], alt_message: "No beans. No coffee."}
        }
    },
    "coffee": {
        image: "https://lh5.googleusercontent.com/-0DLJkGlbhrg/Tv8c1iUzbxI/AAAAAAAAAN0/ckM6zcIywLE/s128/coffee%2Bbeans.jpg",
        canPickUp: true,
        posx: 100,
        posy: 20
    },
    "key": {
        image: "http://icons.iconarchive.com/icons/aha-soft/security/256/key-icon.png",
        canPickUp: true,
        posx: 0,
        posy: 0
    },
    "door": {
        image: "img/door.png",
        canPickUp: false,
        posx: 560,
        posy: 210,
        actions: {
            "open": { requires: "key", scene: "kitchen", alt_message: "Can't open door. Locked.", remove: ["key"] }
        }
    },
    "djinni": {
        image: "https://pbs.twimg.com/profile_images/2845043349/979b3030b0f72c7401a77600741e9c8e.jpeg",
        canPickUp: false,
        posx: 300,
        posy: 300,
        actions: {
            "touch": { message: "Ouch! What's wrong with you?!" }
        },
        dialog: {
            say: "What is 3 times three?",
            answers: {
                "3": {
                    say: "Your answer is 3?",
                    answers: {
                        "Ahm... yes?": {
                            say: "That's wrong.",
                            remove: ["djinni"],
                            add: ["lamp"],
                            reset: true,
                        },
                        "No... of course not. It's 2.": {
                            say: "Really? I don't think so.",
                            remove: ["djinni"],
                            add: ["lamp"],
                            reset: true,
                        }
                    }
                },
                "9": {
                    say: "Sounds right, but is false..",
                    answers: {
                        "Are you kidding?": {
                            say: "Nope.",
                            remove: ["djinni"],
                            add: ["lamp"],
                            reset: true,
                        },
                        "3 x 3 = 9, stupid!": {
                            say: "..%&$#?@!",
                            remove: ["djinni"]
                        }
                    }
                },
                "three three three": {
                    say: "W R O N G",
                    remove: ["djinni"],
                    add: ["lamp"],
                    reset: true,
                },
                "threethreethree": {
                    say: "Right answer. This is for you!",
                    add: ["magic fork"],
                    remove: ["djinni"],
                },
                "Counter question. Where is the kitchen?": {
                    say: "As you wish...",
                    scene: "kitchen",
                    remove: ["djinni"],
                    add: ["lamp"],
                }
                       
            }              
        }
            
    }
};
