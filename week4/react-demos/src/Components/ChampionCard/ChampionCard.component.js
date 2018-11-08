import React from 'react';

export class ChampionCardComponent extends React.PureComponent {

  render() {
    return (
      <div className="col col-12 col-md-6 col-lg-3 champ-col">
        <div className="card champ-card">
          <img className="card-img-top" src="https://lolstatic-a.akamaihd.net/frontpage/apps/prod/LolGameInfo-Harbinger/en_US/8588e206d560a23f4d6dd0faab1663e13e84e21d/assets/assets/images/gi-landing-top.jpg" alt="Card cap" />
          <ul className="list-group list-group-flush">
            <li className="list-group-item">Name: {this.props.champion.name}</li>
            <li className="list-group-item">Role: {this.props.champion.role}</li>
          </ul>
        </div>
      </div>
    )
  }
}