import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JPanel{
    private static final long serialVersionUID = 2L;
    public Login() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0, 2));
        JButton jb = new JButton("Войти");
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                    Frame frame = findActiveFrame();
//                    if (frame!=null){
//                        frame.removeAll();
                MainPage main = new MainPage();
                jp.removeAll();
                jp.add(main);
                jp.revalidate();
                jp.repaint();
//                        frame.revalidate();
//                        frame.repaint();
//                    }
            }
        });
        add(jp);
    }
}
