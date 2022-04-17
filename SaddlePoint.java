import java.util.Scanner;

class SaddlePoint {
    int M;
    int[][] A;

    public static void main(String[] args) {
        SaddlePoint a = new SaddlePoint();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order of Matrix(M): ");
        M = sc.nextInt();
        A = new int[M][M];
        System.out.println("Enter Matrix of " + M + "x" + M + ": ");
        for (int x = 0; x < M; x++)
            for (int y = 0; y < M; y++)
                A[x][y] = sc.nextInt();
        System.out.println("Entered Matrix:-");
        for (int x = 0; x < M; x++) {
            for (int y = 0; y < M; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
        sc.close();
    }

    void check() {
        int found = 0;
        for (int x = 0; x < M; x++)
            for (int y = 0; y < M; y++) {
                int vl = A[x][y];
                if (min_row(vl, x) && max_col(vl, y)) {
                    found++;
                    System.out.println("Saddle Point found at " + x + "," + y + " = " + vl);
                }
            }
        if (found == 0)
            System.out.println("No Saddle Point found");
    }

    boolean min_row(int v, int i) {
        int min = A[i][0];
        for (int x = 0; x < M; x++) {
            int vl = A[i][x];
            min = vl < min ? vl : min;
        }
        return min == v;
    }

    boolean max_col(int v, int i) {
        int max = A[0][i];
        for (int x = 0; x < M; x++) {
            int vl = A[x][i];
            max = vl > max ? vl : max;
        }
        return max == v;
    }
}