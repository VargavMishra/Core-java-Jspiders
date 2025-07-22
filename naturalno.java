import java.util.Scanner;

public class naturalno {
    public static void main(String[]args)
    {
        System.out.println("Enter number");
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        System.out.println("Enter end of number");
        int en=scn.nextInt();

        while(n<=en){
            System.out.println(n);
            n++;
        }
        scn.close();


    }
    
}
