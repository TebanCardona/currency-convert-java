package Principal;

import javax.swing.JOptionPane;

/**
 * This is the main class for the conversion program.
 * It allows users to select between currency conversion and temperature
 * conversion.
 *
 * @TebanCardona
 */
public class Principal {
  /**
   * The main method where the program starts.
   *
   * @param args Command-line arguments (not used)
   */
  public static void main(String[] args) {
    Response res = new Response();
    while (true) {
      String options = (JOptionPane.showInputDialog(null, "Select an convert option", "Menu",
          JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Currency Convert", "Tempeture Convert" }, "Select"))
          .toString();
      String input = JOptionPane.showInputDialog(null, "enter the amount to be converted");
      if (!NumberValidation(input)) {
        JOptionPane.showMessageDialog(null, "Invalid Value");
      }
      double Minput = Double.parseDouble(input);
      switch (options) {
        case "Currency Convert":
          System.out.println(Minput);
          // Todo Convert Here
          res.run();
          break;
        case "Tempeture Convert":
          System.out.println(Minput);
          // Todo convert Here
          res.run();
          break;
        default:
          return;
      }
    }
  }

  /**
   * Validates if the input is a valid number.
   *
   * @param input The input to be validated
   * @return True if the input is a valid number, false otherwise
   */
  public static boolean NumberValidation(String input) {
    try {
      double x = Double.parseDouble(input);
      if (x >= 0 || x < 0)
        ;
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
