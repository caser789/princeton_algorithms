public class ReverseArray
{
    public static void main(String[] args)
    {
        double[] a = {5, 4, 3, 2, 1};
        double[] b = reverse(a);
        printArray(b);
    }
    public static double[] reverse(double[] a)
    {
        for (int i=0; i<a.length/2; i++)
        {
            double tmp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = tmp;
        }
        return a;
    }
    public static void printArray(double[] a)
    {
        for (int i=0; i<a.length; i++)
            StdOut.println(a[i]);
    }
}
