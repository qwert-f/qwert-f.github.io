package experiment;

import java.util.Scanner;

// this method need input all number
public class example3_5_1 {
    public static void main(String args[]) {
        System.out.print("please input the first to start the program:");
        System.out.print("enter 0 as tail!");
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        double first = reader.nextDouble();
        for(int i=1;i<=10;i++){
            sum = sum+first;
            first = reader.nextDouble();
        }
        
        System.out.print(1/sum+"\n");
        System.out.print(sum);
        reader.close();
    }
}
