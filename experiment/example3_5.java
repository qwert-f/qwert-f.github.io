package experiment;

import java.util.Scanner;

public class example3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the first to start the program:");
        long first = scanner.nextInt();
        double sum = 0,item = first,n = 10;
        for(int i=1;i<=n;i++){
            sum = sum+item;
            item = 10*item+first;
        }
        System.out.print(1/sum+"\n");
        System.out.print(sum);
        scanner.close();
    }
}
