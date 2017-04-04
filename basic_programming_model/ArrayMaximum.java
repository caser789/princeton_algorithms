public class ArrayMaximum
{
    public static void main(String[] args)
    {
        double[] a = {1, 2, 5, -1, 0, 8};
        double max = a[0];
        for (int i=1; i<a.length; i++)
            if (a[i]>max) max=a[i];
        StdOut.println(max);
    }
}
