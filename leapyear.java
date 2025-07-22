import java.util.Scanner;
public class leapyear {
    public static void main(String[]args)
    {
        System.out.println("Enter Year");
        Scanner sc1 = new Scanner(System.in);
        int year=sc1.nextInt();
        // if starts
        if(year%4==0)
        {
            System.out.println("Its a Leap Year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("Its a Leap Year");
        }
        else if ((year%4==0 && year%100!=0)||(year%400==0))
        {
            System.out.println("Its a Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");

        }
        sc1.close();

    }

    
}
