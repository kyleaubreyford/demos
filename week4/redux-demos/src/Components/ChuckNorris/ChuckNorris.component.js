import React from 'react';
import { buyJoke } from '../../Redux/Actions/ChuckNorris.actions';
import { connect } from 'react-redux';

export class ChuckNorrisComponent extends React.Component {
  render() {
    return (
      <div>
        <h1>
          {this.props.joke}
        </h1>
        {
        this.props.clicks >= 20 && 
          <button className="btn btn-danger"
            onClick={this.props.buyJoke}
            disabled={!this.props.buyJokeEnabled}>
            Buy Joke If You Dare!!!
          </button>
        }
      </div>
    )
  }
}

const mapStateToProps = (state) => {
  return {
    joke: state.chuckNorris.joke,
    clicks: state.clicker.clicks,
    buyJokeEnabled: state.chuckNorris.buyJokeEnabled
  }
}

const mapDispatchToProps = {
  buyJoke
}

export default connect(mapStateToProps, mapDispatchToProps)(ChuckNorrisComponent)