public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        if (k >= m * n) {
            System.out.println("Error: Number of mines must be less than the total number of cells.");
            return;
        }

        char[][] grid = new char[m][n];
        int minesPlaced = 0;

        while (minesPlaced < k) {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);

            if (grid[row][col] != '*') {
                grid[row][col] = '*';
                minesPlaced++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != '*') {
                    int count = 0;
                    for (int r = Math.max(0, i - 1); r <= Math.min(m - 1, i + 1); r++) {
                        for (int c = Math.max(0, j - 1); c <= Math.min(n - 1, j + 1); c++) {
                            if (grid[r][c] == '*') {
                                count++;
                            }
                        }
                    }
                    grid[i][j] = (char) (count + '0');
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
