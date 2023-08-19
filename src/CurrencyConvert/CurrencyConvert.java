package CurrencyConvert;

import helpers.Exchange;

public class CurrencyConvert {
  private Exchange ex = new Exchange();

  public void DollarToPeso(double Minput) {
    double result = ex.convert(Minput, 4100);
    ex.dialog("Dollars", "Pesos", result);
  }

  public void PesoToDollar(double Minput) {
    double result = ex.convert(Minput, 0.00024);
    ex.dialog("Pesos", "Dollars", result);
  }

  public void EuroToPeso(double Minput) {
    double result = ex.convert(Minput, 4466);
    ex.dialog("Euros", "Pesos", result);
  }

  public void PesoToEuro(double Minput) {
    double result = ex.convert(Minput, 0.00022);
    ex.dialog("Pesos", "Euros", result);
  }

}
