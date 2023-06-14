import React ,{useState ,useEffect} from 'react';
import './App.css';
import Header from "./Header";
import AddFlight from "./AddFlight";
import FlightList from "./FlightList";

function App() {
  const LOCAL_STORAGE_KEY="flights";
const [flights,setFlights]= useState([]);
  
const addFlightHandler =(flight)=>{
  console.log(flight);
  setFlights([...flight, flight]);
}

useEffect(()=>{
  localStorage.getItem(LOCAL_STORAGE_KEY);},[flights]);

useEffect(()=>{
  localStorage.setItem(LOCAL_STORAGE_KEY,JSON.stringify(flights));
},[flights]);

  return (
      <div className='ui container'>
   <Header/>
  <AddFlight addFlightHandler={addFlightHandler}/>
  <FlightList flights={flights}/>
   </div>
  );
}

export default App;
