public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);

        int[] frequencies = new int[m + 1];
        int totalCount = 0;

        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            if (num < 1 || num > m) {
                System.err.println("Integer must be between 1 and " + m);
                return;
            }
            frequencies[num]++;
            totalCount++;
        }

        double entropy = 0.0;
        for (int frequency : frequencies) {
            if (frequency != 0) {
                double proportion = (double) frequency / totalCount;
                entropy -= proportion * (Math.log(proportion) / Math.log(2));
            }
        }

        System.out.printf("%.4f\n", entropy);
    }
}
