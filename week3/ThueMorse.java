public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] thueMorse = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            int count = 0;
            int num = i;
            while (num != 0) {
                count += num % 2;
                num = num / 2;
            }
            thueMorse[i] = count % 2;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorse[i * n + j] == thueMorse[i] && thueMorse[i * n + j] == thueMorse[j]) {
                    System.out.print("+  ");
                }
                else {
                    System.out.print("-  ");
                }
            }
            System.out.println();
        }
    }
}
