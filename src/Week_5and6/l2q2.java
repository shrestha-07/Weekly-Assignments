import java.util.*;
public class l2q2 {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int[] age=new int[3];
            double[] height=new double[3];
            int young=150; double tall=0.0;
            for(int i=0;i<3;i++){
                System.out.print("Enter Age "+(i+1)+" : ");
                age[i]=sc.nextInt();
                System.out.print("Enter Height "+(i+1)+" : ");
                height[i]=sc.nextDouble();
                if(age[i]<young)
                    young=age[i];
                if(height[i]>tall)
                    tall=height[i];
            }
            System.out.println("Tallest Height : "+tall);
            System.out.println("Youngest Age : "+young);
        }
    }
}
