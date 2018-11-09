import {combineReducers} from 'redux';
import { clickerReducer } from './Clicker.reducer';
import { chuckNorrisReducer } from './ChuckNorris.reducer';

export const state = combineReducers({
  clicker: clickerReducer,
  chuckNorris: chuckNorrisReducer
})