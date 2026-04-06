import java.util.*;
public class l1q1 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int[] age=new int[3];
            for(int i=0;i<3;i++){
                System.out.print("Enter Age "+(i+1)+" : ");
                age[i]=sc.nextInt();
                if(age[i]<=0) 
                    System.out.println("Invalid Age !");
                else if(age[i]<18)
                    System.out.println("The student with the age "+age[i]+" cannot vote.");
                else
                    System.out.println("The student with the age "+age[i]+" can vote.");
            }
        }
    }
}
