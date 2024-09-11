import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    private final JFrame frame = new JFrame();
    private final JTextField result = new JTextField("0");
    private final JButton zero = new JButton("0");
    private final JButton one = new JButton("1");
    private final JButton two = new JButton("2");
    private final JButton three = new JButton("3");
    private final JButton four = new JButton("4");
    private final JButton five = new JButton("5");
    private final JButton six = new JButton("6");
    private final JButton seven = new JButton("7");
    private final JButton eight = new JButton("8");
    private final JButton nine = new JButton("9");
    private final JButton equal = new JButton("=");
    private final JButton plus = new JButton("+");
    private final JButton minus = new JButton("-");

    public Calculator(){
        result.setEditable(false);
        result.setBounds(50, 0, 200, 50);



        one.setBounds(75, 150, 50, 50);
        two.setBounds(125, 150, 50, 50);
        three.setBounds(175, 150, 50, 50);
        four.setBounds(75, 100, 50, 50);
        five.setBounds(125, 100, 50, 50);
        six.setBounds(175, 100, 50, 50);
        seven.setBounds(75, 50, 50, 50);
        eight.setBounds(125, 50, 50, 50);
        nine.setBounds(175, 50, 50, 50);
        zero.setBounds(125, 200, 50, 50);
        equal.setBounds(175, 200, 50, 50);
        plus.setBounds(225, 200, 50, 50);
        minus.setBounds(225, 150, 50, 50);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        equal.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);

        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(zero);
        frame.add(equal);
        frame.add(plus);
        frame.add(minus);
        frame.add(result);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

    }
}
