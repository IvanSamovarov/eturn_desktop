import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JPanel{
    private static final long serialVersionUID = 2L;
    public Login() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        JButton jb = new JButton("Войти");
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainPage main = new MainPage();
                jp.removeAll();
                jp.add(main);
                jp.revalidate();
                jp.repaint();
            }
        });
        add(jp);
    }
}
