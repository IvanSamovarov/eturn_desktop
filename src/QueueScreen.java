import javax.swing.*;
import java.awt.*;

public class QueueScreen extends JFrame 
{
    private JLabel queueNameLabel;
    private JLabel queueInfoLabel;
    private JTextArea queueMembersTextArea;

    public QueueScreen(String queueName, int queueSize, String queueMembers[]) 
    {
        setTitle("Queue Screen");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        queueNameLabel = new JLabel("Queue Name: " + queueName);
        queueInfoLabel = new JLabel("Queue Size: " + queueSize);
        queueMembersTextArea = new JTextArea();
        queueMembersTextArea.setEditable(false);

        for (String member : queueMembers) 
        {
            queueMembersTextArea.append(member + "\n");
        }

        setLayout(new BorderLayout());
        add(queueNameLabel, BorderLayout.NORTH);
        add(queueInfoLabel, BorderLayout.CENTER);
        add(new JScrollPane(queueMembersTextArea), BorderLayout.SOUTH);

        setVisible(true);
    }
    public static void main(String[] args) 
    {
        String queueName = "Example Queue";
        int queueSize = 5;
        String queueMembers[] = new String[] { "item1", "item2", "item3", "item4", "item5" };
        SwingUtilities.invokeLater(() -> new QueueScreen(queueName, queueSize, queueMembers));
    }
}