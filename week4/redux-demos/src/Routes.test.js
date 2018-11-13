import React from 'react';
import { mount } from 'enzyme';
import { MemoryRouter } from 'react-router';
import { Routes } from './Routes';
import { FourOFourComponent } from './Components/404/FourOFour.componetn';
describe('Routes Component', () => {

  it('should render the 404 component when the path is not recognized',() => {
    const wrapper = mount(
      <MemoryRouter initialEntries={['/jlkdsjflksdjfl']}>
        <Routes />
      </MemoryRouter>);
    expect(wrapper.find(FourOFourComponent)).toHaveLength(1)
  })

})

