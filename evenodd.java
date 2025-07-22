import java.util.Scanner;
public class evenodd 
{
    public static void main(String[]args)
    {
        System.out.println("Enter number");
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        //if starts
        if(n%2==0)
        {
            System.out.println("Even Number");
        }
        else 
        {
            System.out.println("Odd Number");
        }
        sc.close();
    }

}
