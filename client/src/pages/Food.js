import React from 'react';
import FoodMenu from '../components/FoodMenu'
import CustomParallax from '../components/CustomParallax'
import home_top from "../assets/home_top.jpg";

export default function Food() {
    return (
        <React.Fragment>
            <CustomParallax title='FOOD MENU' img={home_top} height={300 }/>
            <FoodMenu className='Food'/>
        </React.Fragment>
    );
}