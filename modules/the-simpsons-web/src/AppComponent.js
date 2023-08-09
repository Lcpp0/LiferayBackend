import React,{useState} from 'react';
import StudioGhibliComponent from "./fetchApi/StudioGhibliComponent";
import TheSimpsonsComponent from './serviceBuilder/TheSimpsonsComponent';

function AppComponent() {
	const [showStudioGhibli, setShowStudioGhibli] = useState(false);
	const [showTheSimpsons, setShowTheSimpsons] = useState(false);
  
	const handleStudioGhibliClick = () => {
	  setShowStudioGhibli(true);
	  setShowTheSimpsons(false);
	};
  
	const handleTheSimpsonsClick = () => {
	  setShowStudioGhibli(false);
	  setShowTheSimpsons(true);
	};
  
	return (
	  <div>
	  <img src="/o/the-simpsons-web-1.0.0/img/Karl.png" alt="My Image" />
		<h1>App Component</h1>
		<button className="ghibliButton" onClick={handleStudioGhibliClick}>Studio Ghibli</button>
		<button className="simpsonsButtonMain" onClick={handleTheSimpsonsClick}>The Simpsons</button>
  
		{showStudioGhibli && <StudioGhibliComponent />}
		{showTheSimpsons && <TheSimpsonsComponent />}
	  </div>
	);
  }
  
  export default AppComponent;