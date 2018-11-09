export const chuckNorrisTypes = {
  BUY_NEW_JOKE: 'BUY_NEW_JOKE',
  DISABLE_BUY_JOKE: 'DISABLE_BUY_JOKE'
}

export const buyJoke = () => (dispatch) => {
  dispatch({
    type: chuckNorrisTypes.DISABLE_BUY_JOKE
  })
  fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]')
    .then(resp => resp.json())
    .then(data => {
      dispatch({
        type: chuckNorrisTypes.BUY_NEW_JOKE,
        payload: {
          joke: data.value.joke,
          amount: 20
        }
      })
    })
}