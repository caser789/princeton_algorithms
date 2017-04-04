public class Primary
{
    public static void main(String[] args)
    {
        int a = 1;
        StdOut.println(isPrimary(a));
        int b = 2;
        StdOut.println(isPrimary(b));
        int c = 3;
        StdOut.println(isPrimary(c));
        int d = 4;
        StdOut.println(isPrimary(d));
    }
    public static boolean isPrimary(int a)
    {
        if (a<2) return false;
        for (int i=2; i*i<=a; i++)
            if (a%i==0) return false;
        return true;
    }
}
