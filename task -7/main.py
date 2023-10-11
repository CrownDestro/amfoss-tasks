import requests
import json

# Replace these with your actual API keys
OPENWEATHERMAP_API_KEY = '37ac03bbcf5e0bc801f80fe0ed629ce9'
GOOGLE_MAPS_API_KEY = 'AIzaSyBgqWjBwzdzvBcsA3V_KhUO19DxAD5Bxvg'

def get_weather(location):
    # Make a request to the OpenWeatherMap API to get the weather for the given location.
    url = f"https://api.openweathermap.org/data/2.5/weather?q={location}&appid={'37ac03bbcf5e0bc801f80fe0ed629ce9'}"
    try:
        response = requests.get(url)
        response.raise_for_status()  # Raise an exception if the request was not successful
        # Parse the JSON response.
        data = json.loads(response.content)
        # Return the weather data.
        return data
    except requests.exceptions.RequestException as e:
        print(f"An error occurred: {e}")
        return None

def get_area(location):
    # Make a request to the Google Maps API to get the area for the given location.
    url = f"https://maps.googleapis.com/maps/api/geocode/json?address={location}&key={'AIzaSyBgqWjBwzdzvBcsA3V_KhUO19DxAD5Bxvg'}"
    try:
        response = requests.get(url)
        response.raise_for_status()  # Raise an exception if the request was not successful
        # Parse the JSON response.
        data = json.loads(response.content)
        # Return the area data.
        return data
    except requests.exceptions.RequestException as e:
        print(f"An error occurred: {e}")
        return None

def main():
    # Get the user's location.
    location = input("Enter a location: ")
    # Get the weather data for the user's location.
    weather = get_weather(location)
    if weather:
        # Get the area data for the user's location.
        area = get_area(location)
        if area:
            # Print the weather and area data.
            print(f"The weather in {location} is currently {weather['weather'][0]['description']} with a temperature of {weather['main']['temp']} degrees Fahrenheit.")
            print(f"The area of {location} is {area['results'][0]['formatted_address']}.")

if __name__ == "__main__":
    main()
