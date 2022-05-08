import java.util.Scanner;

public class Anstoßen 
{
    int prost (int n)
    {
        int Anzahl = 0;
        for(int i = 1; i<n; i++)
        {
            Anzahl = i + Anzahl;
        }
        return Anzahl;
    }


    public static void main(String[] args)
    {
        System.out.println("Geben Sie die Anzahl der Gäste ein: ");
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        scanner.close();
        Anstoßen InstanceAnstoßen = new Anstoßen();
        int Anstoesse = InstanceAnstoßen.prost(n);
        System.out.println("Die Zahl der Anstöße beträgt: " + Anstoesse);
    }
}
