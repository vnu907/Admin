import React from 'react'

class AddFlight extends React.Component {
  state ={
   location: "",
   date:"",
   time:"",
   Deslocation:"",
   Desdate:"",
   Destime:"",
   price:"",
  };
  add=(e)=>{
    e.preventDefault();
    if(this.state.location==="" || this.state.date==="" || this.state.time==="" || this.state.Deslocation==="" || this.state.Desdate==="" || this.state.Destime==="" || this.state.price===""){
        alert("All the field are mandatory!");
        return;
    };
    this.props.addFlightHandler(this.state);
    this.setState({location: "", date: "", time:"", Deslocation: "",Desdate:"",Destime:"",price:""});
  
  };
  
  
    render (){
  return(
    <div className="ui main">
       <h4>   Add
       </h4>
       <h2>Add Flight</h2>
       
       <form className="ui form" onSubmit={this.add}>
    <div className='field'>
    <label>Flight Departure Location</label>
    <input type='location' name='location' placeholder='Departure Location' value={this.state.location} onChange={(e)=> this.setState({location: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Flight Departure date</label>
    <input type='date' name='date' placeholder='Destination date' value={this.state.date} onChange={(e)=> this.setState({date: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Flight Departure time</label>
    <input type='time' name='time' placeholder='Departure time' value={this.state.time} onChange={(e)=> this.setState({time: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Flight Destination Location</label>
    <input type='location' name='Deslocation' placeholder='Destination Location' value={this.state.Deslocation} onChange={(e)=> this.setState({Deslocation: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Flight Destination date</label>
    <input type='date' name='Desdate' placeholder='Destination date' value={this.state.Desdate} onChange={(e)=> this.setState({Desdate: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Flight Destination time</label>
    <input type='time' name='Destime' placeholder='Destination time' value={this.state.Destime} onChange={(e)=> this.setState({Destime: e.target.value})}/>
    </div>
    <div className='field'>
    <label>Price</label>
    <input type='number' name='price' placeholder='Price' value={this.state.price} onChange={(e)=> this.setState({price: e.target.value})}/>
    </div>
    
    <button className="ui button blue">Add</button>

    </form>
    </div>
  );
}
}
export default AddFlight;