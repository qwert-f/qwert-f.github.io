package experiment;

// summary the prime number within 100
public class example3_7 {
    public static void main(String[] args) {
        int i,sum = 0,count = 0; //initial copy is 1
        for(int j=2;j<=900;j++){
            for(i=2;i<=j;i++){
                if(j%i==0)
                    break;   
            }
            if(i>j/2){
                System.out.print(j+" ");
                count = count+1;
                sum = sum+j;
                if(count%25==0){
                    System.out.print("\n"); //beauty the output 
                }
            }
        }
    System.out.print("\n"+"sum is:"+sum+"\n"+count);
    }
}
