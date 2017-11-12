package view;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View {

    public JComboBox<String> options;
    public JButton cancel;
    public JButton accept;
    public JPanel panel;
    public JLabel image;
    public JFrame view;

    public View() {
        options = new JComboBox<>();
        accept = new JButton();
        cancel = new JButton();
        panel = new JPanel();
        image = new JLabel();
        view = new JFrame();
    }

    public void build() {
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setLocationRelativeTo(null);
        view.setSize(400, 500);
        view.setResizable(false);
        view.setVisible(true);
        view.getContentPane().add(panel);

        accept.setBounds(250, 440, 100, 25);
        accept.setText("Aceptar");

        cancel.setBounds(50, 440, 100, 25);
        cancel.setText("Cancelar");
        
        options.setBounds(100, 15, 200, 25);
        image.setBounds(7, 50, 380, 380);

        panel.setLayout(null);
        panel.add(options);
        panel.add(accept);
        panel.add(cancel);
        panel.add(image);
    }

    public void updateOptions(String [] list) {
        options.removeAllItems();
        for (String item : list) {
            options.addItem(item);
        }
    }

    public void updateImage() {
        image.setIcon(new ImageIcon("src/view/img/" +
        getSelection() + ".jpg"));
    }

    public String getSelection() {
        return (String) options.getSelectedItem();
    }

}