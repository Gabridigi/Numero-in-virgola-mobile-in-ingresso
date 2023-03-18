import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);
        System.out.println("Inserire numero in virgola mobile");
        double numero = in.nextDouble();
        if (numero<0)
        {
           System.out.println("Il numero è negativo");    
        }
        else if(numero>0)
        {
            System.out.println("Il numero è positivo");
        }
        else   //qui non ha bisogno di numero == 0 perché è sicuramente 0 :)
        {
            System.out.println("Il numero è zero");
        }
        
        if(Math.abs(numero) < 1){
            System.out.println("Small");
        }
        else if(Math.abs(numero) > 1000000){   //qui invece serve assolutamente else if perché la condizione è cruciale!! Bisogna usare else if invece che solo if cosìcche se l'if sovrastante (riga 20) ha lavorato allora il programma non perde tempo ad eseguire else if. (piccola nota per maggiore comprensione)
            System.out.println("Large");
        }
    }
}
