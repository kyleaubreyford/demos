import React from 'react';

export class ClickerComponent extends React.Component {
  constructor(props) {
    super(props);
    // only do this in constructor to initialize state
    this.state = {
      multiplier: 1,
      clicks: 25
    }
  }

  increment = () => {
    const { clicks, multiplier } = this.state;
    // use set state everywhere other than constructor
    this.setState({
      ...this.state,
      clicks: clicks + multiplier
    })
  }

  increaseMultiplier = () => {
    this.setState({
      clicks: this.state.clicks - 5,
      multiplier: this.state.multiplier + 1
    })
  }

  render() {
    const { clicks } = this.state;
    return (
      <>
        <div className={(clicks % 5 === 0) ? 'blue': 'red'}>
          Clicks: {clicks}
        </div>
        <button className="btn btn-primary" onClick={this.increment} >Increment</button>
        {
          (clicks >= 5) && (
            <button className="btn btn-success" onClick={this.increaseMultiplier}>Add 1 to multiplier </button>
          )
        }
      </>
    )
  }
}