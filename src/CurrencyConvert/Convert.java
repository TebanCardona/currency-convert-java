package CurrencyConvert;

import javax.swing.JOptionPane;

public class Convert {

  CurrencyConvert convert = new CurrencyConvert();

  public void CurrConvert(double Minput) {

    String option = (JOptionPane.showInputDialog(null, "Choose the currency you want to convert your money to",
        "Currencies", JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "DollarToPeso", "PesoToDollar", "EuroToPeso", "PesoToEuro" }, "Select")).toString();
    switch (option) {
      case "DollarToPeso":
        convert.DollarToPeso(Minput);
        break;
      case "EuroToPeso":
        convert.EuroToPeso(Minput);
        break;

      case "PesoToDollar":
        convert.PesoToDollar(Minput);
        break;

      case "PesoToEuro":
        convert.PesoToEuro(Minput);
        break;
      default:
        break;
    }
  }
}
