public class ArrayUndSchleife
{
   public static void main (String[] args)
   {
    int [] a = {1,2,3};
    System.out.println("Array: " + java.util.Arrays.toString(a));
    int [] a1 = new int[(a.length+1)/2]; //gerade
    int [] a2 = new int[a.length/2];     //ungerade
    int g = 0;
    int u = 0;
    for(int i=0; i<a.length;i++)
    {
        if(i%2==0)
        {
            a1[g]=a[i];
            g++;
        }
        if(i%2!=0)
        {
            a2[u] = a[i];
            u++;
        }
    }
    System.out.println("Ungerade Positionen: " + java.util.Arrays.toString(a2));
    System.out.println("Gerade Positionen: " + java.util.Arrays.toString(a1));

   int glength = 0;
   int ulength = 0;
   for (int i = 0; i<a.length; i++)
   {
        if(a[i]%2==0)
        {
            glength++;
        }
        if(a[i]%2!=0)
        {
            ulength++;
        }
   }
   int [] b1 = new int[glength];
   int [] b2 = new int[ulength];
   int gnew = 0;
   int unew = 0;
   for (int i = 0; i<a.length; i++)
   {
        if(a[i]%2==0)
        {
            b1[gnew]=a[i];
            gnew++;
        }
        if(a[i]%2!=0)
        {
            b2[unew]=a[i];
            unew++;
        }
   }
   System.out.println("Ungerade Werte: " + java.util.Arrays.toString(b2));
   System.out.println("Gerade Werte: " + java.util.Arrays.toString(b1));
   }
}