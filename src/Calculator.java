import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

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
    private final JButton clear = new JButton("CE");
    private final JButton[] buttonArray = {seven, eight, nine, four, five, six, one, two, three, clear, zero, equal, plus, minus};
    private int op1 = 0;
    private int op2 = 0;
    private int digits = 0;
    private Stack<String> operator = new Stack<>();

    public Calculator(){
        setUpGUI();
        addButtonsToFrame();
        result.setEditable(false);
        frame.add(result);
    }

    private void addButtonsToFrame(){
        for(int i = 0; i < buttonArray.length; i++){
            buttonArray[i].addActionListener(this);
            frame.add(buttonArray[i]);
        }
    }

    private void setUpGUI(){
        final int row1 = 50, row2 = 100, row3 = 150, row4 = 200;
        final int rows[] = {row1, row2, row3, row4};
        final int col1 = 75, col2 = 125, col3 = 175, col4 = 225;
        final int cols[] = {col1, col2, col3, col4};
        final int digitWidth = 50, digitHeight = 50, operatorWidth = 30, operatorHeight = 50;
        int counter = 0;
        for (int i = 0; i < 4; i++){    // row
            for(int j = 0; j < 3; j++){ // col
                    buttonArray[counter++].setBounds(cols[j], rows[i], digitWidth, digitHeight);
            }
        }
        result.setBounds(50, 0, 200, 50);
        plus.setBounds(col4, row4, operatorWidth, operatorHeight);
        minus.setBounds(col4, row3, operatorWidth, operatorHeight);
        equal.setEnabled(false);
        plus.setEnabled(false);
        minus.setEnabled(false);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(((JButton)e.getSource()).getText().equals("+")){
            if(op1 == 0) {
                op1 = digits;
                digits = 0;
                operator.push("+");
                equal.setEnabled(true);
            } else {
                operatorEquals("+");
            }
        } else if (((JButton)e.getSource()).getText().equals("-")){
            if(op1 == 0) {
                op1 = digits;
                digits = 0;
                operator.push("-");
                equal.setEnabled(true);
            } else {
                operatorEquals("-");
            }
        } else if (((JButton)e.getSource()).getText().equals("=")){
            equals();
        } else if (((JButton)e.getSource()).getText().equals("CE")){
            clearCalculator();
        } else {    // it must be a number if not the other options
            plus.setEnabled(true);
            minus.setEnabled(true);
            digits = digits * 10 + Integer.parseInt(((JButton)e.getSource()).getText());
            result.setText(String.valueOf(digits));
        }
    }

    public void equals(){
        minus.setEnabled(false);
        plus.setEnabled(false);
        equal.setEnabled(false);
        op2 = digits;
        if(operator.peek().equals("+")){
            result.setText(String.valueOf(op1 + op2));
            operator.pop();
        } else if(operator.peek().equals("-")){
            result.setText(String.valueOf(op1 - op2));
            operator.pop();
        }
        op1 = 0;
        op2 = 0;
        digits = 0;
    }

    public void operatorEquals(String opType){
        op2 = digits;
        if(operator.peek().equals("+")){
            op1 = op1 + op2;
            result.setText(String.valueOf(op1));
            operator.pop();
        } else if(operator.peek().equals("-")){
            op1 = op1 - op2;
            result.setText(String.valueOf(op1));
            operator.pop();
        }
        result.setText(String.valueOf(op1));
        digits = 0;
        if(opType.equals("+")){
            operator.push("+");
        } else if (opType.equals("-")){
            operator.push("-");
        }
    }

    public void clearCalculator(){
        minus.setEnabled(false);
        plus.setEnabled(false);
        equal.setEnabled(false);
        op1 = 0;
        digits = 0;
        result.setText("0");
        operator.clear();
    }

}
