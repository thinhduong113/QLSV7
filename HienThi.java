import java.awt.HeadlessException;
import javax.swing.JFrame;

public class HienThi extends JFrame{
    HienThi(){
        Logging ht = new Logging();
        ht.setTitle("Login");
        ht.setResizable(false);
        ht.setLocationRelativeTo(null);
        ht.setVisible(true);
        ht.pack();
    }
}
