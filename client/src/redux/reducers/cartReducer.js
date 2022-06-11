const initialState = {
    total: 0,
    totalPrice: 0,
    items: {
        'Fiery Chicken Wings': {
            num: 0,
            img: 'https://d21klxpge3tttg.cloudfront.net/wp-content/uploads/2017/05/featured-nashville-hot-wings-1024x577.jpg',
            title: 'Fiery Chicken Wings',
            price: '375',
            description: 'Smoked chicken wings with a fiery hot pepper sauce',
            meal: 'appetizer'
        },
        'Spaghetti Aglio e Olio': {
            num: 0,
            img: 'https://imagesvc.meredithcorp.io/v3/mm/image?url=https%3A%2F%2Fstatic.onecms.io%2Fwp-content%2Fuploads%2Fsites%2F43%2F2021%2F10%2F27%2F8962968_original-Tammy-2000.jpg',
            title: 'Spaghetti Aglio e Olio',
            price: '299',
            description: 'Classic Italian pasta with garlic, olive oil, parsley, and Parmigiano-Reggiano cheese',
            meal: 'appetizer'
        },
        'Tofu Tod': {
            num: 0,
            img: 'http://www.rachelcooksthai.com/wp-content/uploads/2016/01/fried-tofu-20.jpg',
            title: 'Tofu Tod',
            price: '249',
            description: 'fried tofu with a mild chili peanut sauce',
            meal: 'appetizer'
        },
        'Fresh Thai Summer Roll': {
            num: 0,
            img: 'https://food.fnr.sndimg.com/content/dam/images/food/fullset/2011/6/6/0/FN_Chicken-Summer-Rolls_s4x3.jpg.rend.hgtvcom.826.620.suffix/1371597708666.jpeg',
            title: 'Fresh Thai Summer Roll',
            price: '300',
            description: 'with shrimp in a tamarind sauce',
            meal: 'appetizer'
        },
        'Fried Tiger Shrimp Rolls': {
            num: 0,
            img: 'https://media1.fdncms.com/riverfronttimes/imager/u/original/2633986/sushi_house_white_tiger.jpg',
            title: 'Fried Tiger Shrimp Rolls',
            price: '249',
            description: 'with a plum sauce',
            meal: 'appetizer'
        },
        'Thai Spare Ribs': {
            num: 0,
            img: 'https://static01.nyt.com/images/2017/08/16/dining/16kitchenrex/16Kitchen-recs-articleLarge.jpg',
            title: 'Thai Spare Ribs',
            price: '385',
            description: 'glazed and grilled pork ribs',
            meal: 'appetizer'
        },
        'Rib Eye Steak': {
            num: 0,
            img: 'https://ichef.bbci.co.uk/food/ic/food_16x9_1600/recipes/rib-eye_steak_with_61963_16x9.jpg',
            title: 'Rib Eye Steak',
            price: '425',
            description: ' with a rich and creamy béarnaise sauce, doesnt get better than this',
            meal: 'main'
        },
        'Gai Pad Khing': {
            num: 0,
            img: 'https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Kai_phat_khing.jpg/250px-Kai_phat_khing.jpg',
            title: 'Gai Pad Khing',
            price: '345',
            description: 'sauteed sliced chicken with mushrooms, peppers, cabbage, carrots and onions in a fresh ginger sauce',
            meal: 'main'
        },
        'Nuur Kra Prow': {
            num: 0,
            img: 'https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/EA260A79-7F93-4F6E-B587-A6C9AE1F4FDB/Derivates/8f2988c1-bc54-4806-b4a8-62d2dbfc8db8.jpg',
            title: 'Nuur Kra Prow',
            price: '400',
            description: 'sauteed sliced beef with peppers, cabbage, carrots and onions in a chili basil sauce',
            meal: 'main'
        },
        'BBQ Chicken Pizza': {
            num: 0,
            img: 'https://www.tasteandtellblog.com/wp-content/uploads/2021/01/BBQ-Chicken-Pizza-1-768x512.jpg',
            title: 'BBQ Chicken Pizza',
            price: '475',
            description: 'Top the dough with your favorite BBQ sauce, shredded chicken, and thinly sliced onion',
            meal: 'main'
        },
        'Fried Banana': {
            num: 0,
            img: 'https://img.delicious.com.au/DCI69ugT/w1200/del/2016/04/banana-fritters-28785-1.jpg',
            title: 'Fried Banana',
            price: '275',
            description: 'deep-fried banana topped with coconut ice cream',
            meal: 'desert'
        },
        'Gelato': {
            num: 0,
            img: 'https://tarasmulticulturaltable.com/wp-content/uploads/2018/10/Tiramisu-Gelato-2-of-3-500x500.jpg',
            title: 'Gelato',
            price: '300',
            description: 'seasonal flavor made in-house with the best ingredients',
            meal: 'desert'
        },
        'Death By Chocolate': {
            num: 0,
            img: 'https://irepo.primecp.com/2015/04/218935/Death-By-Chocolate_ArticleImage-CategoryPage_ID-977283.jpg?v=977283',
            title: 'Death by Chocolate',
            price: '249',
            description: 'A must try for all chocolate lovers',
            meal: 'desert'
        }
    }
};

export default (state = initialState, action) => {
    switch (action.type) {
        case 'ADD':
            state = {
                ...state,
                total: state.total + action.num,
                totalPrice: state.totalPrice + (state.items[action.title].price * action.num),
                items: {
                    ...state.items,
                    [action.title]: {
                        ...state.items[action.title],
                        num: state.items[action.title].num + action.num
                    }
                }
            };
            break;
        case 'SET':
            state = {
                ...state,
                total: state.total + action.num,
                totalPrice: state.totalPrice + (state.items[action.title].price * action.num),
                items: {
                    ...state.items,
                    [action.title]: {
                        ...state.items[action.title],
                        num: action.num
                    }
                }
            };
            break;
        case 'SUB':
            state = {
                ...state,
                total: state.total - action.num,
                totalPrice: state.totalPrice - (state.items[action.title].price * action.num),
                items: {
                    ...state.items,
                    [action.title]: {
                        ...state.items[action.title],
                        num: state.items[action.title].num - action.num
                    }
                }
            };
            break;
        case 'ZERO':
            state = {
                ...state,
                total: state.total - state.items[action.title].num,
                totalPrice: state.totalPrice - (state.items[action.title].num * state.items[action.title].price),
                items: {
                    ...state.items,
                    [action.title]: {
                        ...state.items[action.title],
                        num: 0
                    }
                }
            };
            break;
        case 'RESET':
            state = initialState;
            break;
    }

    return state;
}

