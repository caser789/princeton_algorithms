import java.util.Arrays;

public class SortedRandomNumberArray
{
    public static void main(String[] args)
    {
        int N = 100;
        double[] b = new double[N];
        for (int i=0; i<N; i++)
            b[i] = StdRandom.random();
        Arrays.sort(b);
        for (int i=0; i<N; i++)
        {
            double x = 1.0*i/N;
            double y = b[i]/2.0;
            double rw = 0.5/N;
            double rh = b[i]/2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }

    }
}
