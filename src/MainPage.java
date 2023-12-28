import Entity.Turn;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.List;

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
        List<Turn> allQueue = new ArrayList<>();
        Turn turn = new Turn(0, "Eturn", "Жопа", "Андрей", 0, 10);
        Turn turn2 = new Turn(1, "ТОЭ", "Попа", "Купова", 1, 17);
        allQueue.add(turn);
        allQueue.add(turn2);
//        ArrayList<String> queue_list = new ArrayList<>(); // Список с очередями
//        queue_list.add("Сдача ТОЭ"); // Незнаю, насколько правильно, но пока вся
//        queue_list.add("Купова А.В.");  // информация об очереди в одном массиве
//        queue_list.add("143");          // Как будто бы похрен?
//        allQueue.add(queue_list);
//
//        ArrayList<String> queue_list1 = new ArrayList<>();
//        queue_list1.add("Eturn");
//        queue_list1.add("Васильев А.А.");
//        queue_list1.add("10");
//        allQueue.add(queue_list1);

//        for (int i = 0; i < allQueue.size(); i++) {
//            text = ""; // Запихиваю данные из массива в одну переменную
//            for (int j = 0; j < allQueue.get(i).size(); j++) {
//                text = text + allQueue.get(i).get(j);
//                if (j < allQueue.get(i).size() - 2) {
//                    text = text + ", ";
//                }
//            }
        for (Turn i: allQueue) {
            JLabel label4 = new JLabel();
            label4.setText(i.getName());
            jp.add(label4);
        }
//        JLabel label4 = new JLabel();
//        label4.setText(text);
//        jp.add(label4);
        jb.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                        jp.removeAll();
                        CreateQueue create = new CreateQueue();
                        jp.add(create);
                        jp.revalidate();
                        jp.repaint();
                }
        });
        add(jp);
    }
}
