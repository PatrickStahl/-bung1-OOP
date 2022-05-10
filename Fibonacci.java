import java.util.Scanner;

public class Fibonacci
{
    static void Calculate (int n)
    {
        int result = 0;
        int summand1 = 0;
        int summand2 = 1;
    
        for (int i = 1; i<n; i++)
        {
            result = summand1 + summand2;
            summand1 = summand2;
            summand2 = result;
        }
        if(n==1)
        {
            System.out.println("Das Ergebnis der Fibonacci-Folge lautet: 1");
        }
        else
        {
            System.out.println("Das Ergebnis der Fibonacci-Folge lautet: " + result);
        }
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die Länge n ihrer Fibonacci-Folge ein: ");
        int n = 0;
        n = scanner.nextInt();
        if(n<0)
        {
            System.out.println("Negative Zahl eingegeben!");
            System.out.println("Programm wird beendet...");
            System.exit(0);
        }
        scanner.close();
        Calculate(n);
        
    }
}