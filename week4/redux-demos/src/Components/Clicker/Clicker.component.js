import React from 'react';
import { connect } from 'react-redux';

import * as clickerActions from '../../Redux/Actions/Clicker.actions';

export class ClickerComponent extends React.PureComponent {

  render() {
    const { clicks } = this.props.clicker;
    return (
      <>
        <div className={(clicks % 5 === 0) ? 'blue': 'red'}>
          Clicks: {clicks}
        </div>
        <button className="btn btn-primary" onClick={this.props.increment} >Increment</button>
        {
          (clicks >= 5) && (
            <button className="btn btn-success" onClick={()=>this.props.increaseMultiplier(1, 5)}>Add 1 to multiplier </button>
          )
        }
      </>
    )
  }
}

const mapStateToProps = (state) => {
  return {
    clicker: state.clicker
  }
}
 
const mapDispatchToProps = {
  increment: clickerActions.increment,
  increaseMultiplier: clickerActions.increaseMultiplier
}

export default connect(mapStateToProps, mapDispatchToProps)(ClickerComponent)