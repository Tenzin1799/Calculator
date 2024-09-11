import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField result = new JTextField("0");
        result.setEditable(false);
        result.setBounds(50, 20, 200, 50);


        frame.add(result);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
