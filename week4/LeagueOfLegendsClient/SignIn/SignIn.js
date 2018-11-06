function login(event) {
  event.preventDefault();
  const username = document.getElementById('input-username').value;
  const password = document.getElementById('inputPassword').value;

  const cred = {
    username,
    password
  }
  console.log(cred);

  fetch('http://localhost:8080/LeagueOfLegendsApi/users/login', {
    method: 'POST',
    body: JSON.stringify(cred),
    headers: {
      'Content-Type': 'application/json'
    },
    credentials: 'include'
  })
    .then(res => {
      if (res.status === 200) {
        window.location = '../ViewChampions/ViewChampions.html'
      }
    })
    .catch(err => {
      console.log(err);
    })
}