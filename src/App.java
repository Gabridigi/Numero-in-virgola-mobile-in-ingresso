import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        System.out.println("Inserire numero in virgola mobile");
        double numero = in.nextDouble();
        if (numero<0)
        {
            if(Math.abs(numero)<1)
            {
                System.out.println("Il numero è negativo");
                System.out.println("Small");
            }
            else
            {
                System.out.println("Il numero è negativo");
            }
            
        }
        else if(numero>0)
        {
            if(numero>1000000)
            {
                System.out.println("Il numero è positivo"); 
                System.out.println("Large");  
            }
            else if(Math.abs(numero)<1)
            {
                System.out.println("Il numero è positivo");
                System.out.println("Small");
            }
            else
            {
                System.out.println("Il numero è positivo");
            }
        }
        else if (numero==0)
        {
            System.out.println("Il numero è zero");
        }
    }
}
