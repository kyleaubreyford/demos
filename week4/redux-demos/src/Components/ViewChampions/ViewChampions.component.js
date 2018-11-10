import React from 'react';
import { ChampionCardComponent } from '../ChampionCard/ChampionCard.component';
import LeagueClient from '../../AxiosClients/LeagueClient';

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

  removeChampion = (id) => (event) => {
    console.log(id);
    const newList = this.state.champions.filter(champ => {
      return champ.id !== id;
    });
    console.log(newList);

    this.setState({
      ...this.state,
      champions: newList
    })
  }

  componentDidMount() {
    LeagueClient.get('champions')
      .then(resp => {
        this.setState({
          champions: resp.data
        })
      })
      .catch(err => {
        console.log(err);
      });
  }


  render() {
    return (
      <div className="container">
        <div className="row" id="champion-container">
          {
            this.state.champions.map(champion => 
              <ChampionCardComponent 
                key={champion.id} 
                champion={champion}
                removeChampion={this.removeChampion} />
            )
          }
        </div>
      </div>
    )
  }
}