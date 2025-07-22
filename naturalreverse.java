import java.util.Scanner;
public class naturalreverse {
    public static void main(String[]args)
    {
        System.out.println("Enter a number");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("--------------------");

        //while loop
        while(n>=1)
        {
            System.out.println(n);
            n--;
        }
        scn.close();

    }
    
}
