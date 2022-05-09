import java.util.Scanner;

public class Anstoßen 
{
    int prost (int n)
    {
        n--;
        if(n==1)
        {
            return 1;
        }
        return (n + prost(n));
    }


    public static void main(String[] args)
    {
        System.out.println("Geben Sie die Anzahl der Gäste ein: ");
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        scanner.close();
        Anstoßen InstanceAnstoßen = new Anstoßen(); //funktion prost ist nicht statisch, deshalb muss man eine neue instanz erstellen
        int Anstoesse = InstanceAnstoßen.prost(n);
        System.out.println("Die Zahl der Anstöße beträgt: " + Anstoesse);
    }
}
