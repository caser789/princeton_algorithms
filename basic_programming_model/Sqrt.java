public class Sqrt
{
    public static void main(String[] args)
    {
        double a = 3.0;
        StdOut.println(sqrt(a));
    }
    public static double sqrt(double a)
    {
        if (a<0.0) return Double.NaN;
        double err = 1e-15;
        double t = a;
        while (Math.abs(t-a/t) > err*t)
            t = (a/t+t) / 2.0;
        return t;
    }
}
