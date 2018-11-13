import React from 'react';
import { Switch, Route } from 'react-router';
import { HomeComponent } from './Components/Home/Home.component';
import { SecondComponent } from './Components/Second.component';
import { ViewChampionsComponent } from './Components/ViewChampions/ViewChampions.component';
import { FourOFourComponent } from './Components/404/FourOFour.componetn';
import { SignInComponent } from './Components/SignIn.component.js/SignIn.component';
import ClickerComponent from './Components/Clicker/Clicker.component';
import { CreateChampionComponent } from './Components/CreateChampion/CreateChampion.component';
import ChuckNorrisComponent from './Components/ChuckNorris/ChuckNorris.component';
import { NestedComponent } from './Components/Nested/Nested.component';
import { TicTacComponent } from './Components/TicTac/TicTac.component';
import { FirstComponent } from './Components/First.component';

export class Routes extends React.Component {

  render() {
    return (
      <div id="main-content-container">
        <Switch>
          <Route path="/first" component={FirstComponent} />
          <Route path="/second" component={SecondComponent} />
          <Route path="/view-champions" component={ViewChampionsComponent} />
          <Route path="/home" component={HomeComponent} />
          <Route path="/sign-in" component={SignInComponent} />
          <Route path="/clicker" component={ClickerComponent} />
          <Route path="/add-champion" component={CreateChampionComponent} />
          <Route path="/chuck-norris" component={ChuckNorrisComponent} />
          <Route path="/nested" component={NestedComponent} />
          <Route path="/tic-tac-toe" component={TicTacComponent} />

          {/* default */}
          <Route component={FourOFourComponent} />
        </Switch>
      </div>
    )
  }
}