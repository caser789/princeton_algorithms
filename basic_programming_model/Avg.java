public class Avg
{
    public static void main(String[] args)
    {
        double[] a = {1, 2, 3, 4, 5, 6};
        StdOut.println(avg(a));
    }
    public static double sum(double[] a)
    {
        double sum = 0;
        for (int i=0; i<a.length; i++)
            sum += a[i];
        return sum;
    }
    public static double avg(double[] a)
    {
        double s = sum(a);
        return s / a.length;
    }
}
