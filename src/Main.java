import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       runCalculator();
    }

    public static void runCalculator(){
        JFrame frame = new JFrame();
        JTextField result = new JTextField("0");
        result.setEditable(false);
        result.setBounds(50, 0, 200, 50);

        JButton zero = new JButton("0");
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton equal = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");

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
}
