class incedecre{
    public static void main(String[]args)
    {
        int a=0,b=0;
        b=++a+a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-----------------------");

        int c=0,d=0;
        d= ++c + ++c;

        System.out.println(c);
        System.out.println(d);

        System.out.println("-----------------------");

        int e=0;
        e=++e;
        e=++e;
        e=e++;
        e=e++;
        System.out.println(e);



    }
}