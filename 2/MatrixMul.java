import java.util.Scanner;

class MatrixMul {
    int[][] arr;
    int m, n;

    MatrixMul(int m1, int n1) {
        m = m1;
        n = n1;
        arr = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrx of " + m + " x " + n + " = ");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                arr[x][y] = sc.nextInt();
    }

    MatrixMul multiply(MatrixMul A) {
        if (n != A.m) {
            System.out.println("MAtrix Multiplicaton not applicable");
            System.exit(-1);
        }
        MatrixMul B = new MatrixMul(m, A.n);
        for (int x = 0; x < m; x++)
            for (int y = 0; y < A.n; y++) {
                int sum = 0;
                for (int i = 0; i < n; i++)
                    sum += arr[x][i] * A.arr[i][y];
                B.arr[x][y] = sum;
            }
        return B;
    }

    void print() {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n of the Matrix 1: ");
        MatrixMul a = new MatrixMul(sc.nextInt(), sc.nextInt());
        a.input();
        System.out.print("Enter m,n of the Matrix 2: ");
        MatrixMul b = new MatrixMul(sc.nextInt(), sc.nextInt());
        b.input();
        MatrixMul C = a.multiply(b);
        System.out.println("Multiplied Matrix: ");
        C.print();
        sc.close();
    }
}
