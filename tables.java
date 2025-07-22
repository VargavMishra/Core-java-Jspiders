import java.util.Scanner;

public class tables {
    public static void main(String[]args)
    {
        System.out.println("Enter a number whoose table you want");
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            System.out.println("--------------------");
            //loop
            int i;
            for(i=1;i<=10;i++)
            {
                System.out.println(n+"X"+i+"="+(n*i));
            }
    
        scn.close();
    }
    
    
}
