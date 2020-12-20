import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MVC {
    public static void main(String args[]) {
        WindowTrapezoid win = new WindowTrapezoid();
        win.setTitle("MVC");
        win.setBounds(100,100,520,520);
    }
}
class WindowTrapezoid extends JFrame implements ActionListener {
    Trapezoid trapezoid;
    JTextField bottom, top, height;
    JTextArea showArea;
    JButton controlButton;
    WindowTrapezoid() {
        init();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    void init() {
        trapezoid = new Trapezoid();
        bottom = new JTextField(5);
        top = new JTextField(5);
        height = new JTextField(5);
        showArea = new JTextArea();
        controlButton = new JButton("calc area");
        JPanel panelLayout = new JPanel();
        panelLayout.add(new JLabel("bottom size:"));
        panelLayout.add(bottom);
        panelLayout.add(new JLabel("top size:"));
        panelLayout.add(top);
        panelLayout.add(new JLabel("height size:"));
        panelLayout.add(height);
        panelLayout.add(controlButton);
        bottom.setForeground(Color.red);
        top.setForeground(Color.blue);
        height.setForeground(Color.green);
        showArea.setForeground(Color.orange);
        controlButton.setForeground(Color.pink);
        showArea.setSelectionColor(Color.gray);
        controlButton.addActionListener(this);
        add(panelLayout, BorderLayout.NORTH);
        add(new JScrollPane(showArea), BorderLayout.CENTER);
    }
    public void actionPerformed(ActionEvent e) {
        try {
            double b = Double.parseDouble(bottom.getText().trim());
            double t = Double.parseDouble(top.getText().trim());
            double h = Double.parseDouble(height.getText().trim());
            trapezoid.setB(b);
            trapezoid.setT(t);
            trapezoid.setH(h);
            String area = trapezoid.getArea();
            showArea.append("THE TRAPEZOID \n BOTTOM_SIZE_IS:\n" + b + "Vn,TOP_SIZE_IS:\n" + t + "\n,HEIGHT_SIZE_IS:\n"+h+"\nAREA_IS:\n");
            showArea.append(area + "\n");
        } catch (Exception exp) {
            showArea.append("\n" + exp + "\n");
        }
    }
}
class Trapezoid {
    double sideB, sideT, sideH, area;
    public String getArea() {
        area = (sideT+sideB)*sideH/2;
        return String.valueOf(area);
    }
    public void setB(double b) {
        sideB = b;
    }
    public void setT(double t) {
        sideT = t;
    }
    public void setH(double h) {
        sideH = h;
    }
}