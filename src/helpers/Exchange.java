package helpers;

import javax.swing.JOptionPane;

public class Exchange {
  public double convert(double Minput, double exchange) {
    return Math.round((Minput * exchange) * 100d) / 100;
  }

  public void dialog(String from, String to, double result) {
    JOptionPane.showMessageDialog(null, "The conversion from " + from + " to " + to + " was:\n " + result);
  }
}
