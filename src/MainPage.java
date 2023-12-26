import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JPanel {
    private static final long serialVersionUID = 2L;
    private JFrame frame;

    public MainPage() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0, 2));
        JButton jb = new JButton("Создать очередь");
        jp.add(jb);
        frame = new JFrame();
        jb.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    CreateQueue create = new CreateQueue();
                    JFrame frame2 = new JFrame();
                    frame2.add(create);
                    frame2.setVisible(true);
                    frame2.setSize(640, 480);                // задаем размеры окна
                    frame2.setResizable(false);              // запрещаем менять размер окна
                    frame2.setLocationRelativeTo(null);
                    setVisible(false);
                    frame.dispose();
                    frame.removeAll();
                    frame.revalidate();
                    frame.repaint();
                }
        });
        add(jp);
    }
}
