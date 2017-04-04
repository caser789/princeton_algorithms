public class Abs
{
    public static void main(String[] args)
    {
        int a = -1;
        StdOut.println(abs(a));
        int b = 2;
        StdOut.println(abs(b));
    }
    public static int abs(int a)
    {
        if (a<0) return -a;
        return a;
    }
}
