import java.util.*;;

class Shift {
    int[][] mat;
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Matrix of " + m + " x " + n + " :");
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++)
                mat[x][y] = sc.nextInt();
    }

    void cyclic(Shift A) {
        int[][] mt = new int[m][n];
        for (int x = 0; x < m; x++)
            for (int y = 0; y < n; y++) {
                if (x == 0)
                    mt[m - 1][y] = A.mat[x][y];
                else
                    mt[x - 1][y] = A.mat[x][y];
            }
        mat = mt;
    }

    void display() {
        System.out.println("Shifted Arary :-");
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++)
                System.out.print(mat[x][y] + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m,n for Matrix: ");
        Shift a = new Shift(sc.nextInt(), sc.nextInt());
        a.input();
        a.cyclic(a);
        a.display();
    }
}
