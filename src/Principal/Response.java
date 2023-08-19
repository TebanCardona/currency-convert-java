package Principal;

import javax.swing.JOptionPane;

/**
 * The Response class handles user interaction to determine whether to continue
 * the program or finish it.
 *
 * @TebanCardona
 */
public class Response {
  /**
   * Displays a confirmation dialog to the user and responds based on the user's
   * choice.
   * If the user chooses to continue, the program continues. If the user chooses
   * to finish, the program ends.
   */
  public void run() {
    int response = JOptionPane.showConfirmDialog(null, "Would you like to perform another conversion?");
    if (JOptionPane.OK_OPTION == response) {
      System.out.println("Select Affirmative option");
    } else {
      JOptionPane.showMessageDialog(null, "Finished program");
    }
  }
}
