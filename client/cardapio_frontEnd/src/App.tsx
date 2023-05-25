import { useState } from 'react'
import './App.css'
import { Card } from './components/card/card';
import { FoodData } from './interface/FoodData';
import { useFoodData } from './hooks/useFoodData';

function App() {
  const {data} = useFoodData();
  return (
    <div class="container">
      <h1>Cardapio</h1>
      <div className="card-grid">
        {data?.map(foodData => 
        <Card 
          price={foodData.price} 
          image={foodData.image} 
          name={foodData.name}
        />)}
      </div>
    </div>
  )
}

export default App
