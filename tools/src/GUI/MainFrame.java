package GUI;

import javax.swing.*;
import java.awt.event.MouseAdapter;

public class MainFrame extends JFrame{
    private JPanel panel;
    private JLabel label;
    private JButton buttonAnalyze, buttonDelete;
    private JTextField textField;
    private JScrollPane scroll;
    private MouseAdapter mouse;

    public MainFrame() {
        setTitle("Disc cleaner - clean your browser cache!");
        setBounds(300, 300, 500, 300);
        panel = new JPanel();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
