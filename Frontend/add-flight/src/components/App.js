import React ,{useState,useEffect}from 'react';
import {v4 as uuid} from "uuid";
import './App.css';
import Header from "./Header";
import AddFlight from "./AddFlight";
import FlightList from "./FlightList";

function App() {
  const LOCAL_STORAGE_KEY="flights";
const [flights,setFlights]=useState(
  JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY))??[]);



  
// const [flights,setFlights]= useState([]);
  
const addFlightHandler =(flight)=>{
  console.log(flight);
  setFlights([...flights, {id:uuid(),...flight }]);
};

const removeFlightHandler=(id)=>{
  const newFlightList=flights.filter((flight) => {
    return flight.id !== id;
  });
  setFlights(newFlightList);
};

// useEffect(()=>{
//  const retriveFlights= JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY));
// if(retriveFlights) setFlights(retriveFlights);
// } ,[]);

useEffect(()=>{
  localStorage.setItem(LOCAL_STORAGE_KEY,JSON.stringify(flights));
 } ,[flights]);


// const flights=[
//   {
//     id: "1",
//     location:"Bhopal",
//     date: "2023-06-12",
//     time: "12:30",
//     Deslocation:"Pune",
//     Desdate: "2023-06-12",
//     Destime: "15:30",
//     price: "7000"
//   },
//   {
//     id: "2",
//     location:"Bhopal",
//     date: "2023-06-12",
//     time: "12:30",
//     Deslocation:"Nagpur",
//     Desdate: "2023-06-12",
//     Destime: "15:30",
//     price: "7300"
//   },
// ]

  return (
    <div className="ui container">
   <Header/>
  <AddFlight addFlightHandler={addFlightHandler}/>
  <FlightList flights={flights} getFlightId={removeFlightHandler}/>
   </div>
  );
}

export default App;
