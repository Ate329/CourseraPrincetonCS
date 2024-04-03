public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] counts = new int[n + 2];

        for (int t = 0; t < trials; t++) {
            boolean[] hasBirthday = new boolean[n];
            int peopleCount = 0;

            while (true) {
                int birthday = (int) (Math.random() * n);
                peopleCount++;

                if (hasBirthday[birthday]) {
                    break;
                }
                else {
                    hasBirthday[birthday] = true;
                }
            }

            counts[Math.min(peopleCount, n + 1)]++;
        }

        double total = 0;
        for (int i = 1; i < counts.length; i++) {
            total += counts[i];
            double fraction = total / trials;

            System.out.print(i + "\t" + counts[i] + "\t");
            System.out.printf("%.6f", fraction);
            System.out.println();

            if (fraction >= 0.5) {
                break;
            }
        }
    }
}
