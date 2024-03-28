public class RandomWalkers
{
    public static void main(String[] args)
    {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        
        int x = 0;
        int y = 0;
        int counter = 0; 
        long dist = 0;
        long total = 0;
        
        for (int i = 0; i <= trials; i++)
        {
            while (dist < r)
            {
                double prob = Math.random();

                if (prob <= 0.25)
                {
                    x += 1;
                }
                else if (prob <= 0.5)
                {
                    x += -1;
                }
                else if (prob <= 0.75)
                {
                    y += 1;
                }
                else if (prob <= 1.00)
                {
                    y += -1;
                }

                dist = Math.abs(x) + (long) Math.abs(y);

                counter++;
            }
            total = total + counter;
        }
        double average = total / (double) trials;
        System.out.println("average number of steps = " + average);
    }
}