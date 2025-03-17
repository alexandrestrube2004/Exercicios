import java.util.Scanner;

public class triangueanaliser
{
    public static void main()
    {
        Scanner ler= new Scanner (System.in);
        int a, b, c;
        
        System.out.printf ("\n welcome to the Triangue Analyzer!!!");
        
        System.out.printf ("\n \n Type the first angle:");
        a=ler.nextInt();
        
        System.out.printf ("\n \n Type the second angle:");
        b=ler.nextInt();
        
        c=180-a-b;
        
        if (a+b<180)
        {
        if ((a==90)||(b==90)||(c==90))
        {
            System.out.printf ("\n \n The third angle is %d", c);
            System.out.printf ("\n \n It is a RIGHT TRIANGUE");
        }
        if ((a>90)||(b>90)||(c>90))
        {
            System.out.printf ("\n \n The third angle is %d", c);
            System.out.printf ("\n \n It is an OBTUSE TRIANGUE");
        }
        if ((a<90)&&(b<90)&&(c<90))
        {
            System.out.printf ("\n \n The third angle is %d", c);
            System.out.printf ("\n \n It is an ACUTE TRIANGLE");
        }
    }
    else
    {
    System.out.printf ("\n \n It is NOT a TRIANGLE", "\n Try again!!!");
}
}
}
