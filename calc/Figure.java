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
	public void setJTextField(JTextField text);
	public void setJTextArea(JTextArea result);
}
class Result implements Calc {
	JTextField inputText;
	JTextArea showText;
	public void setJTextField(JTextField text) {
		inputText = text;
	}
	public void setJTextArea(JTextArea result) {
		showText = result;
	}
	public void actionPerformed(ActionEvent e) {
		String str = inputText.getText();
		String str1[] = str.split(" ");
		int num = 0;
		int count = 0;
		showText.setText(null);
		for (int i = 0;i<str1.length;i++) {
			num += Double.parseDouble(str1[i]);
			count++;
		}
		showText.append((num/count)+" ");
	}
}
class Calculate extends JFrame {
	JTextField input;
	JTextArea output;
	Calc listener;
	public Calculate() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		setLayout(new java.awt.FlowLayout());
		input = new JTextField(10);
		output = new JTextArea(2,10);
		add(input);
		add(new JScrollPane(output));
	}
	void average(Calc listener) {
		this.listener = listener;
		listener.setJTextField(input);
		listener.setJTextArea(output);
		input.addActionListener(listener);
	}
}
