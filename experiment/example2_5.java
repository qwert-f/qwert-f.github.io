package experiment;
import java.util.*;


class example2_5 {
    public static void main(String args[]) {
        int start = 0,end,middle;
        int a[] = {12,45,67,89,123,-45,67};
        int N = a.length;
        for(int i=0;i < N;i++) {    //进行排序
            for(int j=i+1;j <N;j++) {
                if(a[j] < a[i]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入整数，程序判断该整数是否在数组中:");
        int number = scanner.nextInt(); //读取输入的整数
        int count = 0;  //给定一个记数点
        end = N;
        middle = (start+end) / 2;   //这没啥好注释的
        while(number!= a[middle]) { //与排序后的数组中间的值进行比较
            if(number>a[middle])
                start = middle; //输入的大于中位数，将中位数作为新的（折半后的数组）比较的起始位置
            else if(number<=a[middle])
                end = middle;   //与前面的相反
            middle = (start+end) / 2;   //确定性的中位数
            count++;    //记数点自加
            if(count>N/2)
                break;  //数组折半折没了，折不了了
        }
        if(count>N/2) 
            //折完了还没匹配成功  
            System.out.printf("%d不在数组中.",number); 
        else 
            //没折完就找到了
            System.out.printf("%d在数组中.\n",number);
            scanner.close();
    }
}
