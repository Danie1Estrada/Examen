import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UIManager;
import controller.Controller;

/**
 * 
 * @author Daniel
 */
public class Examen {

    public static void main(String args[]) {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) { }

        Controller c = new Controller();
        c.start();
    }
}
