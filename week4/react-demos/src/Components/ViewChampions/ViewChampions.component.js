import React from 'react';
import { ChampionCardComponent } from '../ChampionCard/ChampionCard.component';

export class ViewChampionsComponent extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      champions: [
        {
          id: 1,
          name: 'Quinn',
          role: 'ADC'
        },
        {
          id: 2,
          name: 'Teemo',
          role: 'Being Toxic'
        },
        {
          id: 3,
          name: 'Sona',
          role: 'DJ'
        }
      ]
    }
  }

  componentDidMount() {
    fetch('http://localhost:8080/LeagueOfLegendsApi/champions', {
      credentials: 'include'
    })
      .then(resp => resp.json())
      .then(data => {
        this.setState({
          champions: data
        })
      });
  }


  render() {
    return (
      <div className="container">
        <div className="row" id="champion-container">
          {
            this.state.champions.map(champion => 
              <ChampionCardComponent key={champion.id} champion={champion} />
            )
          }
        </div>
      </div>
    )
  }
}