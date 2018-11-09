import { chuckNorrisTypes } from "../Actions/ChuckNorris.actions";

const initialState = {
  joke: `Chuck Norris doesn't sleep, he waits`,
  buyJokeEnabled: true
}

export const chuckNorrisReducer = (state = initialState, action) => {
  switch (action.type) {
    case chuckNorrisTypes.DISABLE_BUY_JOKE:
      return {
        ...state,
        buyJokeEnabled: false
      }
    case chuckNorrisTypes.BUY_NEW_JOKE:
      return {
        ...state,
        joke: action.payload.joke,
        buyJokeEnabled: true
      }
    default:
      break;
  }

  return state;
}