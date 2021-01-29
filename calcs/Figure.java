package calcs;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Figure {
	public static void main(String[] args) {
		Calculate win = new Calculate();
		Result show = new Result();
		win.average(show);
		win.setBounds(100,100,600,300);
		win.setTitle("计算");
	}
}
interface Calc extends ActionListener {
	public void setJTextField1(JTextField text1);
	public void setJTextField2(JTextField text2);
	public void setJTextArea(JTextArea result);
}
class Result implements Calc {
	JTextField inputText1,inputText2;
	JTextArea showText;
	public void setJTextField1(JTextField text1) {
		inputText1 = text1;
	}
	public void setJTextField2(JTextField text2) {
		inputText2 = text2;
	}
	public void setJTextArea(JTextArea result) {
		showText = result;
	}
	public void actionPerformed(ActionEvent e) {
		try {
			double num1 = Double.parseDouble(inputText1.getText());
            double num2 = Double.parseDouble(inputText2.getText());
			double res = 0;
			if (e.getActionCommand().equals("加")) {
				res = num1+num2;
			}
			else if(e.getActionCommand().equals("减")) {
				res = num1-num2;
			}
			else if(e.getActionCommand().equals("乘")) {
				res = num1*num2;
			}
			else if(e.getActionCommand().equals("除")) {
				res = num1/num2;
			}
			showText.append(null);
			showText.append(res+"  ");
		} catch (Exception exp) {
			showText.append("输入有误");
		}
	}
}
class Calculate extends JFrame {
	JTextField input1,input2;
    JTextArea output;
    JButton button1,button2,button3,button4;
	Calc listener;
	public Calculate() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
        setLayout(new java.awt.FlowLayout());
        button1 = new JButton("加");
        button2 = new JButton("减");
        button3 = new JButton("乘");
        button4 = new JButton("除");
        input1 = new JTextField(10);
        input2 = new JTextField(10);
		output = new JTextArea(2,10);
        add(input1);
        add(input2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
		add(new JScrollPane(output));
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
	}
	void average(Calc listener) {
		this.listener = listener;
		listener.setJTextField1(input1);
		listener.setJTextField2(input2);
		listener.setJTextArea(output);
        input1.addActionListener(listener);
        input2.addActionListener(listener);
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        button4.addActionListener(listener);
	}
}
