public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int[] a = new int[args.length - 1];
        int sum = 0;
        for (int i = 1; i < args.length; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
            sum += a[i - 1];
        }

        int[] cumulativeSum = new int[a.length];
        cumulativeSum[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + a[i];
        }

        for (int i = 0; i < m; i++) {
            int r = (int) (Math.random() * sum);
            int index = 0;
            while (r >= cumulativeSum[index]) {
                index++;
            }
            System.out.print((index + 1) + " ");
        }
        System.out.println();
    }
}
