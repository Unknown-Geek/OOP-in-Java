
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener{
	JFrame window;
	JLabel exp;
	JTextField result;
	JPanel buttonsPanel,resultPanel,displayPanel;
	JButton[] buttons = new JButton[10];
	JButton addition,sub,multiply,divide,equals,del;
	double num1 = 0.0;
	String operator = "";

	Calculator() {
		window = new JFrame("Calculator");
		window.setBounds(300,500,300,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new GridLayout(2,1));

		buttonsPanel = new JPanel();
		resultPanel = new JPanel();
		displayPanel = new JPanel();
		exp = new JLabel("");
		exp.setFont(new Font("Poppins", Font.PLAIN, 14));
		exp.setHorizontalAlignment(JLabel.RIGHT);

		result = new JTextField();
		result.setFont(new Font("Poppins", Font.BOLD, 24));
		result.setHorizontalAlignment(JTextField.RIGHT);
		result.setEditable(false);

		for(int i=0 ; i<10 ; i++) {
			buttons[i] = new JButton(String.valueOf(i));
			buttons[i].setFont(new Font("Poppins", Font.PLAIN, 20));
			buttons[i].addActionListener(this);
		}

		addition = new JButton("+");
		sub = new JButton("-");
		multiply = new JButton("*");
		divide = new JButton("/");
		equals = new JButton("=");
		del = new JButton("C");

		addition.setFont(new Font("Poppins", Font.PLAIN, 20));
		sub.setFont(new Font("Poppins", Font.PLAIN, 20));
		multiply.setFont(new Font("Poppins", Font.PLAIN, 20));
		divide.setFont(new Font("Poppins", Font.PLAIN, 20));
		equals.setFont(new Font("Poppins", Font.PLAIN, 20));
		del.setFont(new Font("Poppins", Font.PLAIN, 20));

		addition.addActionListener(this);
		sub.addActionListener(this);
		multiply.addActionListener(this);
		divide.addActionListener(this);
		equals.addActionListener(this);
		del.addActionListener(this);

		del.setBackground(Color.ORANGE);

		// Setup display panel with expression and result
		resultPanel.setLayout(new BorderLayout());
		JPanel expPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		expPanel.add(exp);
		resultPanel.add(expPanel, BorderLayout.NORTH);
		resultPanel.add(result, BorderLayout.CENTER);

		// Setup buttons
		buttonsPanel.setLayout(new GridLayout(4,4));
		for(int i=9 ; i>6 ; i--)    buttonsPanel.add(buttons[i]);
		buttonsPanel.add(addition);
		for(int i=6 ; i>3 ; i--)    buttonsPanel.add(buttons[i]);
		buttonsPanel.add(sub);
		for(int i=3 ; i>0 ; i--)    buttonsPanel.add(buttons[i]);
		buttonsPanel.add(multiply);
		buttonsPanel.add(del);
		buttonsPanel.add(buttons[0]);
		buttonsPanel.add(equals);
		buttonsPanel.add(divide);

		window.add(resultPanel);
		window.add(buttonsPanel);
		window.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		double num2 = 0.0, ans = 0.0;

		for(int i =0; i<10; i++){
			if(e.getSource() == buttons[i]){
				result.setText(result.getText()+i);
			}
		}
		if(e.getSource() == addition){
			num1 = Double.parseDouble(result.getText());
			operator = "+";
			exp.setText(num1 + " + ");
			result.setText("");
		}
		if(e.getSource() == sub){
			num1 = Double.parseDouble(result.getText());
			operator = "-";
			exp.setText(num1 + " - ");
			result.setText("");
		}
		if(e.getSource() == multiply){
			num1 = Double.parseDouble(result.getText());
			operator = "*";
			exp.setText(num1 + " × ");
			result.setText("");
		}
		if(e.getSource() == divide){
			num1 = Double.parseDouble(result.getText());
			operator = "/";
			exp.setText(num1 + " ÷ ");
			result.setText("");
		}

		if(e.getSource() == equals){
			try{
				num2 = Double.parseDouble(result.getText());
				switch(operator){
					case "+": ans = num1 + num2;
						break;
					case "-": ans = num1 - num2;
						break;
					case "*": ans = num1 * num2;
						break;
					case "/":
						if(num2 == 0) throw new ArithmeticException("Cannot divide by zero");
						else ans = num1/num2;
						break;
				}
				exp.setText(String.valueOf(num1) + " " + operator + " " + String.valueOf(num2) + " =");
				result.setText(String.valueOf(ans));
			}
			catch(ArithmeticException ep){
				exp.setText("Error");
				result.setText(ep.getMessage());
			}
		}
		if(e.getSource() == del){
			result.setText("");
			exp.setText("");
			num1 = 0;
			operator = "";
		}
	}

	public static void main(String args[]) {
		Calculator calc = new Calculator();
	}
}