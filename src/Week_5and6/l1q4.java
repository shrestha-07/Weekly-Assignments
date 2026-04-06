import java.util.*;
public class l1q4 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int i=0,j; double sum=0.0,num;
            double[] arr=new double[10];

            while(true){
                System.out.print("Enter Element : ");
                num=sc.nextDouble();
                if(num==0 || i==9)
                    break;
                arr[i++]=num;
            }

            for(j=0;j<i;j++)
                sum+=arr[j];
            
            System.out.println("Sum = "+sum);
        }
    }
}
