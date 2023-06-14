import React from 'react'
import user from '../images/plane.png'
const DetailsFlight=(props)=> {
  const {id, location,date,time,Deslocation,Desdate,Destime,price}=props.flight;
  return (
   
<div className='items'>
<img className='ui avatar image' sec={user} alt='user'/>
<div className='content'>
<div className='header'>{location}</div>
<div>{date}</div>
<div>{time}</div>
<div className='header'>{Deslocation}</div>
<div>{Desdate}</div>
<div>{Destime}</div>
<div>{price}</div>
</div>
<i className='trash alternate outline icon'
style={{color:"red", marginTop:"10px"}}></i>
</div>

  )
};

export default DetailsFlight