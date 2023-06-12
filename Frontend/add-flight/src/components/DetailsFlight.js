import React from 'react'
import user from '../images/plane.png';

const DetailsFlight=(props)=> {
  const {id, location,date,time,Deslocation,Desdate,Destime,price}=props.flight;
  return (
       
<div className='item'>
<img className='ui avatar image' src={user} alt="user"/>
<div className='content'>
<div className='header'><h4>{location}</h4></div>
<div>{date}</div>
<div>{time}</div>
<div className='header'><h4>{Deslocation}</h4></div>
<div>{Desdate}</div>
<div>{Destime}</div>
<div>{price}</div>

</div>
<i className='trash alternate outline icon'
style={{color:"red", marginTop:"10px"}}
onClick={()=>props.clickHander(id)}></i>
</div>
  )
};

export default DetailsFlight