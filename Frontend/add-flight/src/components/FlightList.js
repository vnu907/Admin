import React from 'react'
import DetailsFlight from './DetailsFlight';

const FlightList=(props) =>{

console.log(props);
  const renderFlightList =props.flights.map((flight)  =>{
    return(
      <DetailsFlight flight={flight}></DetailsFlight>

    );
  })
  return (

    <div className='ui celled list'>{renderFlightList}
    </div>
  )
}

export default FlightList