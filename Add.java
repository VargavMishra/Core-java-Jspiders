import java.util.Scanner;
class Add
{
    public static void main(String[]args)
    {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+"+"+b+"="+(a+b));

        sc.close();
    }
}