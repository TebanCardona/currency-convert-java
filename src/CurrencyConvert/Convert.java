package CurrencyConvert;

import javax.swing.JOptionPane;

public class Convert {

  CurrencyConvert convert = new CurrencyConvert();

  public void CurrConvert(double Minput) {

    String option = (JOptionPane.showInputDialog(null, "Choose the currency you want to convert your money to",
        "Currencies", JOptionPane.PLAIN_MESSAGE, null,
        new Object[] { "Dollar To Peso", "Peso To Dollar", "Euro To Peso", "Peso To Euro" }, "Select")).toString();
    switch (option) {
      case "Dollar To Peso":
        convert.DollarToPeso(Minput);
        break;
      case "Euro To Peso":
        convert.EuroToPeso(Minput);
        break;

      case "Peso To Dollar":
        convert.PesoToDollar(Minput);
        break;

      case "Peso To Euro":
        convert.PesoToEuro(Minput);
        break;
      default:
        break;
    }
  }
}
