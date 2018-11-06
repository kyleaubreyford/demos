fetch('http://localhost:8080/LeagueOfLegendsApi/champions')
  .then(resp => resp.json())
  .then(data => {
    const container = document.getElementById('champion-container');
    container.innerHTML = data.map(champion => `
    <div class="col col-12 col-md-6 col-lg-3 champ-col">
    <div class="card champ-card">
      <img class="card-img-top" src="https://lolstatic-a.akamaihd.net/frontpage/apps/prod/LolGameInfo-Harbinger/en_US/8588e206d560a23f4d6dd0faab1663e13e84e21d/assets/assets/images/gi-landing-top.jpg" alt="Card image cap">
      <ul class="list-group list-group-flush">
        <li class="list-group-item">Name: ${champion.name}</li>
        <li class="list-group-item">Role: ${champion.role}</li>
      </ul>
    </div>
    </div>
    `).join('');
    
  })