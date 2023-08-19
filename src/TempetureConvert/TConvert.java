package TempetureConvert;

import javax.swing.JOptionPane;

public class TConvert {

  TempetureConvert convert = new TempetureConvert();

  public void TempConvert(double Minput) {

    String option = (JOptionPane.showInputDialog(null,
        "Choose the temperature scales you want to convert your degrees to",
        "Tempeture", JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "Fahrenheit To Celsius", "Fahrenheit To Kelvin", "Celsius To Fahrenheit",
            "Celsius To Kelvin", "Kelvin To Celsius", "Kelvin To Fahrenheit" },
        "Select")).toString();
    switch (option) {
      case "Fahrenheit To Celsius":
        convert.FahrenheitToCelsius(Minput);
        break;
      case "Fahrenheit To Kelvin":
        convert.FahrenheitToKelvin(Minput);
        break;

      case "Celsius To Fahrenheit":
        convert.CelsiusToFahrenheit(Minput);
        break;
      case "Celsius To Kelvin":
        convert.CelsiusToKelvin(Minput);
        break;

      case "Kelvin To Celsius":
        convert.KelvinToCelsius(Minput);
        break;
      case "Kelvin To Fahrenheit":
        convert.KelvinToFahrenheit(Minput);
        break;

      default:
        break;
    }
  }
}
