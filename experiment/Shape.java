package experiment;
import java.util.*;

class Triangle {
	int height,bottom;
	int getArea() {
		return bottom*height/2;
	}
	Triangle() {
		bottom = 10;
		height = 8;	
	}
	Triangle(int h,int b) {
		height = h;
		bottom = b;	
	}
}
public class Shape {
	public static void main(String args[]) {
		// int i = 1;
		int number1=0;
		int number2=0;
		Scanner area = new Scanner(System.in);
		while(number1>30 || number1<10) {
			System.out.print("please input integer height use enter as each input tail:");
			number1 = area.nextInt();
		}	
		while(number2>30 || number2<10) {
			System.out.print("please input integer bottom use enter as each input tail:");
			number2 = area.nextInt();
		}
		Triangle angle1 = new Triangle();
		Triangle angle2 = new Triangle(number1,number2);
		System.out.print("no parameter method area is:"+angle1.getArea()+"\n");
		System.out.print("hava parameter method area is:"+angle2.getArea()+"\n");
	}
}