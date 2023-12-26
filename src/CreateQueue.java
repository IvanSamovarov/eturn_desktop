import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateQueue extends JPanel {
    private static final long serialVersionUID = 2L;
    JFrame create;

    public CreateQueue() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0, 2));
        JButton jb = new JButton("ОООООООО");
        jp.add(jb);
        add(jp);
    }
}
