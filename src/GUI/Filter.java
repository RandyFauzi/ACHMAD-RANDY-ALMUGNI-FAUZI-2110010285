
package GUI;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ACHMAD RANDY AL MUGNI FAUZI 2110010285
 */
public class Filter {


    public static void digitFilter(KeyEvent evt) {
        char input = evt.getKeyChar();

        if (!(Character.isDigit(input) || 
              input == KeyEvent.VK_BACK_SPACE || 
              input == KeyEvent.VK_DELETE)) {
            evt.consume(); // Mengabaikan event sehingga tidak diproses lebih lanjut
            JOptionPane.showMessageDialog(null, "Masukkan hanya 0-9!");
        }
    }
}
