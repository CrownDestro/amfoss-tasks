const API_key = '37ac03bbcf5e0bc801f80fe0ed629ce9';

document.addEventListener('DOMContentLoaded', function () {
  const locationInput = document.getElementById('location');
  const checkWeatherButton = document.getElementById('checkWeather');
  const weatherInfo = document.getElementById('weatherInfo');

  checkWeatherButton.addEventListener('click', () => {
    const location = locationInput.value;
    if (location) {
      
      const apiUrl = `https://api.openweathermap.org/data/2.5/weather?q=${location}&appid=${API_key}`;

      
      fetch(apiUrl)
        .then((response) => {
          if (!response.ok) {
            throw new Error('Network error');
          }
          return response.json();
        })
        .then((data) => {
          
          const temperatureKelvin = data.main.temp;
          const temperatureCelsius = (temperatureKelvin - 273).toFixed(2)
          const weatherDescription = data.weather[0].description;
          weatherInfo.textContent = `Weather in ${location}: ${weatherDescription}, ${temperatureCelsius}°C`;
        })
        .catch((error) => {
          console.error('Error:', error);
          weatherInfo.textContent = 'Error fetching weather data.';
        });
    } else {
      weatherInfo.textContent = 'Please enter a location.';
    }
  });
});