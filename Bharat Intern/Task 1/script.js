function convertTemperature() {
    var temperatureInput = document.getElementById("temperature");
    var resultDiv = document.getElementById("result");
  
    if (temperatureInput.value !== "") {
      var temperature = parseFloat(temperatureInput.value);
  
      var celsius = (temperature - 32) * (5 / 9);
      var fahrenheit = (temperature * (9 / 5)) + 32;
  
      resultDiv.innerHTML = temperature + "°C is equal to " + fahrenheit.toFixed(2) + "°F<br>" +
                            temperature + "°F is equal to " + celsius.toFixed(2) + "°C";
    } else {
      resultDiv.innerHTML = "Please enter a temperature.";
    }
  }
  