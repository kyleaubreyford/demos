import React from 'react';
import { shallow } from 'enzyme';
import { ClickerComponent } from './Clicker.component';

describe('Clicker Component', () => {

  it('renders without crashing', () => {
    shallow(<ClickerComponent clicker={{clicks: 5}} />);
  });

  const multiplesOfFive = [0, 5, 25, 2085, 100, 525]
  multiplesOfFive.forEach(multiple => {
    it(`displays clicks with the class blue for ${multiple}`, () =>{
      const wrapper = shallow(<ClickerComponent clicker={{clicks: multiple}} />);
      const display = wrapper.find('#clicker-display');
      expect(display).toHaveLength(1);
      expect(display.hasClass('blue')).toBeTruthy();
    })
  })
  

  const notMultiplesOfFive = [1,2,3,4,23,-12,82,99,66666009324]
  notMultiplesOfFive.forEach(number => {
    it(`displays clicks with the class red for ${number}`, () =>{
      const wrapper = shallow(<ClickerComponent clicker={{clicks: number}} />);
      const display = wrapper.find('#clicker-display');
      expect(display).toHaveLength(1); // expect 1 element to have been found
      expect(display.hasClass('red')).toBeTruthy();
    })
  })

  it('should call the increment function when increment button is clicked', () => {
    const incrementFn = jest.fn(); // create a mock function 
    const wrapper = shallow(
      <ClickerComponent clicker={{clicks: 5}} increment={incrementFn} />
    );
    const incrementButton = wrapper.find('#increment-button');
    incrementButton.first().simulate('click'); 
    incrementButton.first().simulate('click');
    expect(incrementFn).toHaveBeenCalledTimes(2);
  })

  const muliplierButtonTestValuesBelow5 = [-20,0,1,2,3,4];
  muliplierButtonTestValuesBelow5.forEach(number => {
    it(`should not render the multiplier button for value ${number}`, () => {
      const wrapper = shallow(
        <ClickerComponent clicker={{clicks: number}} />
      );
      const incrementButton = wrapper.find('#multiplier-button');
      expect(incrementButton).toHaveLength(0);
    })
  })
  
  const muliplierButtonTestValuesAbove5 = [5,6,7,8,2000,850023];
  muliplierButtonTestValuesAbove5.forEach(number => {
    it(`should render the multiplier button for value ${number}`, () => {
      const wrapper = shallow(
        <ClickerComponent clicker={{clicks: number}} />
      );
      const incrementButton = wrapper.find('#multiplier-button');
      expect(incrementButton).toHaveLength(1);
    })
  })


  it('should call the multiplier function with value 1, 5 when multiplier button is clicked', () => {
    const multiplierFn = jest.fn(); // create a mock function 
    const wrapper = shallow(
      <ClickerComponent clicker={{clicks: 20}} increaseMultiplier={multiplierFn} />
    );
    const incrementButton = wrapper.find('#multiplier-button');
    incrementButton.first().simulate('click');
    expect(multiplierFn).toHaveBeenCalledTimes(1);
    expect(multiplierFn).toBeCalledWith(1,5);
  })


})
