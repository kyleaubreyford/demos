function createChampion(e) {
  e.preventDefault();
  const name = document.getElementById('champion-name').value;
  const role = document.getElementById('champion-role').value;

  const champion = {
    name,
    role
  }

  fetch('http://localhost:8080/LeagueOfLegendsApi/champions', {
    method: 'POST',
    body: JSON.stringify(champion),
    headers: {
      'Content-Type': 'application/json'
    },
    credentials: 'include'
  }).then(res => res.json())
  .then(data => {
    console.log(data);
  })
  .catch(err => {
    console.log(err);
  })
}