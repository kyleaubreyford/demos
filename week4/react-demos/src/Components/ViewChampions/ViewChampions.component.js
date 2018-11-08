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
    fetch('http://localhost:8080/LeagueOfLegendsApi/champions', {
      credentials: 'include'
    })
      .then(resp => resp.json())
      .then(data => {
        this.setState({
          champions: data
        })

        // doing this instead of replacing state will not cause a rerender
        // this.state.champions.push(data[0]);
        // console.log(this.state.champions)
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