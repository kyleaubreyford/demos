import * as clickerActions from './Clicker.actions';

describe('Clicker Actions', () => {
  const incrementReturn = {
    type: clickerActions.clickerTypes.UPDATE_CLICKS,
    payload: {
      amount: 1
    }
  }

  it('should increment by 1 when increment is called with no parameters', () => {
    const result = clickerActions.increment();
    expect(result).toEqual(incrementReturn);
  })

  const testCases = [1, 53, false, true, undefined, null, {}, [], -25];
  testCases.forEach(each => {
    it(`Should increment by 1 for input ${each}`, () => {
      const result = clickerActions.increment(each);
      expect(result).toEqual(incrementReturn);
    })
  })

  it('should increase multiplier by 1 and cost 20', () =>{
    const result = clickerActions.increaseMultiplier(1, 20);
    expect(result).toEqual({
      type: clickerActions.clickerTypes.INCREASE_MULTIPLIER,
      payload: {
        amount: 1,
        cost: 20
      }
    })
  })

})