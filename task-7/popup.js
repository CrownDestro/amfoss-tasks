document.addEventListener('DOMContentLoaded', () => {
  const searchButton = document.getElementById('searchButton');
  const placeInput = document.getElementById('placeInput');
  const placeName = document.getElementById('placeName');
  const temperatureDisplay = document.getElementById('temperatureDisplay');

  searchButton.addEventListener('click', () => {
    // Get the search query from the input field.
    const query = placeInput.value; // Use placeInput instead of searchBar
    // Use the Google Maps API to get the weather and location information for the search query.
    fetch(`https://maps.googleapis.com/maps/api/geocode/json?address=${query}&key=AIzaSyBgqWjBwzdzvBcsA3V_KhUO19DxAD5Bxvg`)
      .then(response => response.json())
      .then(data => {
        // Process the data received from the API here
        console.log(data);
      })
      .catch(error => {
        console.error('Error:', error);
      });
  });
});
