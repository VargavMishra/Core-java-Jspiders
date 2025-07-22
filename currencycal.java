import java.util.Scanner;
public class currencycal {
    public static void main(String[]args)
    {
        System.out.println("Enter ammount");
        Scanner scn = new Scanner(System.in);
        int amt = scn.nextInt();
        //if starts
        System.out.println("Amount is :- "+amt);
        if(amt>2000)
        {
            System.out.println("2000 X"+(amt/2000));
            amt=amt%2000;
        }
        if(amt>500)
        {
            System.out.println("500 X"+(amt/500));
            amt=amt%500;
        }
        if(amt>200)
        {
            System.out.println("200 X"+(amt/200));
            amt=amt%200;
        }
        if(amt>100)
        {
            System.out.println("100 X"+(amt/100));
            amt=amt%100;
        }
        if(amt>50)
        {
            System.out.println("50 X"+(amt/50));
            amt=amt%50;
        }
        if(amt>10)
        {
            System.out.println("10 X"+(amt/10));
            amt=amt%10;
        }
        if(amt>5)
        {
            System.out.println("5 X"+(amt/5));
            amt=amt%5;
        }
        scn.close();

        


    }
    
}
