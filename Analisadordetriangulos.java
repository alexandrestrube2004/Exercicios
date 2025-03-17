import java.util.Scanner;

public class Exum
{
    public static void main()
    {
        Scanner ler=new Scanner (System.in);
        int a1, a2, a3, cont;
        
        System.out.printf("Bem vindo ao Analisador de triângulos!!!");
        System.out.printf ("\n Digite ângulo 1");
        a1= ler.nextInt();
        
        System.out.printf ("\n Digite ângulo 2");
        a2= ler.nextInt();
        
        a3=180-a1-a2;
        
        if (a1+a2+a3== 180)
        {
        if(a1+a2==90)
        {
            System.out.printf ("\n Angulo 3: 90");
            System.out.printf ("\n É triângulo retãngulo");
            
        }
        if (a1>=100)
        {
            System.out.printf ("\n Angulo 3 é igual a:");
            System.out.print (a3);
            System.out.printf ("\n É triãngulo acutângulo");
        }
        if (a2>=100)
        {
            System.out.printf ("\n Angulo 3 é igual a:");
            System.out.print (a3);
            System.out.printf ("\n É triãngulo acutângulo");
        }
        if (a3>=100)
        {
            System.out.printf ("\n Angulo 3 é igual a:");
            System.out.print (a3);
            System.out.printf ("\n É triãngulo acutângulo");
        }
        if((a1<100) && (a2<100) && (a3<100))
        {
            System.out.printf ("\n Ângulo 3 é igual a:");
            System.out.print (a3);
            System.out.printf ("\n É triãngulo obtusângulo");
        }
        
        }
        else
    {
       System.out.printf ("/n Não é triângulo retângulo.");
    }
    }
    
}
