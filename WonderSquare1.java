import java.util.Scanner;

class WonderSquare1 {
    int n;
    int[][] A;

    public static void main(String[] args) {
        WonderSquare1 a = new WonderSquare1();
        a.input();
        a.check();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Order of Square Matrix(n): ");
        n = sc.nextInt();
        A = new int[n][n];
        System.out.println("Enter Matrix of " + n + " by " + n + ": ");
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++)
                A[x][y] = sc.nextInt();
        System.out.println("Entered Matrix:-");
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(A[x][y] + "\t");
            System.out.println();
        }
        sc.close();
        if (check())
            System.out.println("Is a Wonderous Sqaure");
        else
            System.out.println("Is not a Wonderous Sqaure");
    }

    boolean check() {
        int[] cn = new int[n * n + 1]; // storing count of occurences of numbers from 1 to n^2
        // ^ Checking if numbers come in range and they occur only once
        for (int x = 0; x < n; x++)
            for (int y = 0; y < n; y++) {
                int vl = A[x][y];
                if (vl > n * n || vl < 1)
                    return false;
                if (++cn[vl] == 2)
                    return false;
            }
        int sum = n * (n * n + 1) / 2;
        for (int x = 0; x < n; x++)
            if (row_sum(x) != sum)
                return false;
        for (int x = 0; x < n; x++)
            if (col_sum(x) != sum)
                return false;
        return true;
    }

    int col_sum(int i) {
        int sum = 0;
        for (int x = 0; x < n; x++)
            sum += A[x][i];
        return sum;
    }

    int row_sum(int i) {
        int sum = 0;
        for (int x = 0; x < n; x++)
            sum += A[i][x];
        return sum;
    }
}