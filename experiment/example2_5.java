package experiment;
import java.util.*;


class example2_5 {
    public static void main(String args[]) {
        int start = 0,end,middle;
        int a[] = {12,45,67,89,123,-45,67};
        int N = a.length;
        for(int i=0;i < N;i++) {    //��������
            for(int j=i+1;j <N;j++) {
                if(a[j] < a[i]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("���������������жϸ������Ƿ���������:");
        int number = scanner.nextInt(); //��ȡ���������
        int count = 0;  //����һ��������
        end = N;
        middle = (start+end) / 2;   //��ûɶ��ע�͵�
        while(number!= a[middle]) { //�������������м��ֵ���бȽ�
            if(number>a[middle])
                start = middle; //����Ĵ�����λ��������λ����Ϊ�µģ��۰������飩�Ƚϵ���ʼλ��
            else if(number<=a[middle])
                end = middle;   //��ǰ����෴
            middle = (start+end) / 2;   //ȷ���Ե���λ��
            count++;    //�������Լ�
            if(count>N/2)
                break;  //�����۰���û�ˣ��۲�����
        }
        if(count>N/2) 
            //�����˻�ûƥ��ɹ�  
            System.out.printf("%d����������.",number); 
        else 
            //û������ҵ���
            System.out.printf("%d��������.\n",number);
            scanner.close();
    }
}
