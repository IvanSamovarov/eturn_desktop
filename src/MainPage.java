import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainPage extends JPanel {
    private static final long serialVersionUID = 2L;


    private Frame findActiveFrame() {
        Frame[] frames = JFrame.getFrames();
        for (int i = 0; i < frames.length; i++) {
            if (frames[i].isVisible()) {
                return frames[i];
            }
        }
        return null;
    }


    public MainPage() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(0, 2));
        JButton jb = new JButton("Создать очередь");
        jp.add(jb);
        jb.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
//                    Frame frame = findActiveFrame();
//                    if (frame!=null){
//                        frame.removeAll();
                        CreateQueue create = new CreateQueue();
                        jp.removeAll();
                        jp.add(create);
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
