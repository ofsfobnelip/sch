import java.util.Scanner;

class MatrixMul {
    int[][] A, B, C;
    int[][] ind = { { 0, 0 }, { 0, 0 } };

    public static void main(String[] args) {
        MatrixMul a = new MatrixMul();
        a.input();
        a.multiply();
        a.print_matrix(a.C);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int x = 0; x < 2; x++) {
            System.out.print("Enter Row, Column for  Matrix " + (x + 1) + " = ");
            ind[x][0] = sc.nextInt();
            ind[x][1] = sc.nextInt();
            if (x == 0)
                A = new int[ind[x][0]][ind[x][1]];
            else if (x == 1)
                B = new int[ind[x][0]][ind[x][1]];
        }
        if (ind[0][1] != ind[1][0]) {
            System.out.println("Matrix Multiplaication not applicable");
            System.exit(0);
        }
        for (int x = 0; x < 2; x++) {
            System.out.println("Enter Elements of Matrix " + (x + 1) + " :");
            for (int i = 0; i < ind[x][0]; i++) {
                for (int j = 0; j < ind[x][1]; j++) {
                    if (x == 0)
                        A[i][j] = sc.nextInt();
                    else if (x == 1)
                        B[i][j] = sc.nextInt();
                }
            }
        }
        sc.close();
    }

    void multiply() {
        System.out.println("Product Matrix :");
        C = new int[ind[0][0]][ind[1][1]];
        for (int x = 0; x < ind[0][0]; x++) {
            for (int y = 0; y < ind[1][1]; y++) {
                int sum = 0;
                for (int i = 0; i < ind[0][1]; i++) {
                    sum += A[x][i] * B[i][y];
                }
                C[x][y] = sum;
            }
        }
    }

    void print_matrix(int[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[0].length; y++)
                System.out.print(arr[x][y] + "\t");
            System.out.println();
        }
    }
}
