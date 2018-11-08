import React from 'react';
import { FaTrashAlt } from 'react-icons/fa';
import PropTypes from 'prop-types';

export class ChampionCardComponent extends React.PureComponent {

  render() {
    return (
      <div className="col col-12 col-md-6 col-lg-3 champ-col">
        <div className="card champ-card">
          <img className="card-img-top" src="https://lolstatic-a.akamaihd.net/frontpage/apps/prod/LolGameInfo-Harbinger/en_US/8588e206d560a23f4d6dd0faab1663e13e84e21d/assets/assets/images/gi-landing-top.jpg" alt="Card cap" />
          <ul className="list-group list-group-flush">
            <li className="list-group-item">Name: {this.props.champion.name}</li>
            <li className="list-group-item flex-row-sb">
              <div>Role: {this.props.champion.role}</div>
              <div className="pointer red" onClick={this.props.removeChampion(this.props.champion.id)}>
                <FaTrashAlt />
              </div>
            </li>
          </ul>
        </div>
      </div>
    )
  }
}

ChampionCardComponent.propTypes = {
  champion: PropTypes.shape({
    id: PropTypes.number.isRequired,
    name: PropTypes.string.isRequired,
    role: PropTypes.string.isRequired
  }),
  removeChampion: PropTypes.func.isRequired
}