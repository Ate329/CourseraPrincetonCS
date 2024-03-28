public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                double random = Math.random();
                if (random < 0.25) {
                    y++;
                }
                else if (random < 0.5) {
                    x++;
                }
                else if (random < 0.75) {
                    y--;
                }
                else {
                    x--;
                }
                steps++;
            }

            totalSteps += steps;
        }

        double averageSteps = totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
