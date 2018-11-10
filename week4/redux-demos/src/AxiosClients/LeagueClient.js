import axios from 'axios';

const LeagueClient = axios.create({
  baseURL: 'http://localhost:8080/LeagueOfLegendsApi/',
  headers: {
    'Content-Type': 'application/json'
  },
  withCredentials: true
});

export default LeagueClient;