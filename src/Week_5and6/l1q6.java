import java.util.*;
public class l1q6 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            double sum=0.0, mean;
            double[] height=new double[11];
            for(int i=0;i<11;i++){
                System.out.print("Enter Height "+(i+1)+" : ");
                height[i]=sc.nextDouble();
                sum+=height[i];
            }
            mean=sum/11;
            System.out.print("Mean Height = " +mean);
        }   
    }
}
