import React from 'react'
import DetailsFlight from './DetailsFlight';

const FlightList=(props) =>{

console.log(props);

const deleteFlightHandler=(id)=>{
  props.getFlightId(id);
};
  const renderFlightList =props.flights.map((flight)  =>{
    return(
 
      <DetailsFlight flight={flight} clickHander={deleteFlightHandler} key={flight.id}/>

    );
  });
  return <div className='ui celled list'>{renderFlightList} </div>
  
};

export default FlightList