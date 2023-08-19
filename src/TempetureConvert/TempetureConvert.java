package TempetureConvert;

import helpers.Exchange;

public class TempetureConvert {
  private Exchange ex = new Exchange();

  // * Fahrenheit
  public void FahrenheitToCelsius(double Minput) {
    double result = (Minput - 32) * 5 / 9;
    ex.dialog("Fahrenheit", "Celsius", result);
  }

  public void FahrenheitToKelvin(double Minput) {
    double result = (Minput - 32) * 5 / 9 + 273.15;
    ex.dialog("Fahrenheit", "Kelvin", result);
  }

  // * Celsius
  public void CelsiusToFahrenheit(double Minput) {
    double result = (Minput * 1.8) + 32;
    ex.dialog("Celsius", "Fahrenheit", result);
  }

  public void CelsiusToKelvin(double Minput) {
    double result = Minput + 273.15;
    ex.dialog("Celsius", "Kelvin", result);
  }

  // * Kelvin
  public void KelvinToFahrenheit(double Minput) {
    double result = (Minput - 273.15) * 1.8 + 32;
    ex.dialog("Kelvin", "Fahrenheit", result);
  }

  public void KelvinToCelsius(double Minput) {
    double result = Minput - 273.15;
    ex.dialog("Kelvin", "Celsius", result);
  }

}
