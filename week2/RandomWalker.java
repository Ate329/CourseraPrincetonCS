public class RandomWalker
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]);
        
        int x = 0;
        int y = 0;
        int counter = 0; 
        long dist = 0;
        
        while (dist < n)
        {
            System.out.println("(" + x + ", " + y + ")");
            
            double prob = Math.random();

            if (prob <= 0.25)
            {
                x += 1;
            }
            else if (prob <= 0.5)
            {
                x -= 1;
            }
            else if (prob <= 0.75)
            {
                y += 1;
            }
            else
            {
                y -= 1;
            }

            dist = Math.abs(x) + (long) Math.abs(y);

            counter++;
        }
        System.out.println("steps = " + counter);
    }
}
