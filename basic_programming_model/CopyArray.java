public class CopyArray
{
    public static void main(String[] args)
    {
        double[] a = {1, 2, 3, 5};
        double[] b = copy(a);
        printArray(b);
    }
    public static double[] copy(double[] a)
    {
        double[] b = new double[a.length];
        for (int i=0; i<a.length; i++)
            b[i] = a[i];
        return b;
    }
    public static void printArray(double[] a)
    {
        for (int i=0; i<a.length; i++)
            StdOut.println(a[i]);
    }
}
