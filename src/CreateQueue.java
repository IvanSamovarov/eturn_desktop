import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreateQueue extends JPanel {

    public CreateQueue() {

        JFrame frame = new JFrame("Create Queue");
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        JPanel jpButton = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 800);

        JTextArea textMainTop1 = new JTextArea("Создать");
        Font MainFont1 = new Font(null, Font.BOLD, 15);
        textMainTop1.setFont(MainFont1);
        JTextArea textMainTop2 = new JTextArea("название очереди:");
        JTextField addName = new JTextField();
        JTextArea textDescription = new JTextArea("описание очереди:");
        JTextField addDescription = new JTextField();
        JButton createButton = new JButton("создать");
        JButton cancelButton = new JButton("отмена");

        jp.add(textMainTop1);
        jp.add(textMainTop2);
        jp.add(addName);
        jp.add(textDescription);
        jp.add(addDescription);
        jp.add(createButton);
        jp.add(cancelButton);
        frame.getContentPane().add(BorderLayout.NORTH, jp);
        frame.getContentPane().add(BorderLayout.CENTER, jpButton);
        frame.setVisible(true);


/*
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();

        jp.setLayout(new GridLayout(0, 2));
        JButton jb = new JButton("Создать");
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
         */
    }
}
