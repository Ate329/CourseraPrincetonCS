public class BandMatrix
{
    public static void main(String[] args)
    {
        int size = Integer.parseInt(args[0]);
        int distance = Integer.parseInt(args[1]);

        for (int i = 1; i <= size; i++)
        {
            for (int j = 1; j <= size; j++)
            {
                if (Math.abs(i - j) > distance)
                {
                    System.out.print("0  ");
                } 
                else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
