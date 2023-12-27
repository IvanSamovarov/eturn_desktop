import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
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
    } // ищет текущий фрэйм, который работает сейсчас


    public MainPage() {
        setLayout(new BorderLayout());
        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        JButton jb = new JButton("Создать очередь");
        jp.add(jb);
        ArrayList<String> name_list = new ArrayList<>(); // Массив, где лежит ФИО, статус и группа
        name_list.add("Самоваров Иван");
        name_list.add("Студент"); // Пока добавляю это вручную
        name_list.add("2391");
        JLabel label1 = new JLabel();
        String text = ""; // Запихиваю данные из массива в одну переменную
        for(int i = 0; i < name_list.size(); i++){
            text = text + name_list.get(i);
            if(i < name_list.size() - 2){
                text = text + ", ";
            }
        }
        JLabel label2 = new JLabel("ПОЛЬЗОВАТЕЛЬ:");
        label1.setText(text); // Вывожу эту переменную
        jp.add(label2);
        jp.add(label1);
        JLabel label3 = new JLabel("ОЧЕРЕДИ:");
        jp.add(label3);
        ArrayList<String> queue_list = new ArrayList<>(); // Список с очередями
        queue_list.add("Сдача ТОЭ"); // Незнаю, насколько правильно, но пока вся
        queue_list.add("Купова А.В.");  // информация об очереди в одном массиве
        queue_list.add("143");          // Как будто бы похрен?
        text = ""; // Запихиваю данные из массива в одну переменную
        for(int i = 0; i < queue_list.size(); i++){
            text = text + queue_list.get(i);
            if(i < queue_list.size() - 2){
                text = text + ", ";
            }
        }
        JLabel label4 = new JLabel();
        label4.setText(text);
        jp.add(label4);
        jb.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
//                    Frame frame = findActiveFrame();
//                    if (frame!=null){
//                        frame.removeAll();
                        jp.removeAll();
                        CreateQueue create = new CreateQueue();
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
