import React from 'react';
import {Food} from '../utils/index'
import {shallow} from 'enzyme'

it('Should render without errors', () => {
    const component = shallow(<Food/>);
    const Food = component.find('.Food');
    expect(Food.length).toBe(1);
});
