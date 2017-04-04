import java.util.Arrays;

public class ArrayMaximum
{
    public static void main(String[] args)
    {
        double[] a = {0, 2, -1, 3, 8, -9};
        double max = a[0];
        for (int i=1; i<a.length; i++)
            if (a[i]>max) max=a[i];
        StdOut.println(max);
    }
}
