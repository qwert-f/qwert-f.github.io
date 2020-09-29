package experiment;
import java.util.*;


class example2_5 {
    public static void main(String args[]) {
        int start = 0,end,middle;
        // array initialization. format:int array[] = new int[n] and then init array[i] i from 0 to n.
        int a[] = {12,45,67,89,123,-45,67};
        int N = a.length;
        for(int i=0;i < N;i++) {    //start sorting
            for(int j=i+1;j <N;j++) {
                if(a[j] < a[i]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a integer,program judge if the input in array:");
        int number = scanner.nextInt(); //read the number you've input
        int count = 0;  //give a counter
        end = N;
        middle = (start+end) / 2;   //nothing need to comment
        while(number!= a[middle]) { //compare whit the midian in the array which have been sorting 
            if(number>a[middle])
                start = middle; //the input bigger than middle,use midian as the compare initial location of the array halved
            else if(number<=a[middle])
                end = middle;   //opposite with the comment before
            middle = (start+end) / 2;   //determine the midian
            count++;    //counter plus itself
            if(count>N/2)
                break;  //array null,can't half
        }
        if(count>N/2) 
            //match unsuccess after half ending  
            System.out.printf("%d not in array.",number); 
        else 
            //find before half ending
            System.out.printf("%d in array.\n",number);
            scanner.close();
    }
}
