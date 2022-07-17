import java.util.*;

public class StrFib {
    String x = "a", y = "b", z;
    int n;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of 'n': ");
        n = sc.nextInt();
        sc.close();
    }

    void series() {
        System.out.println("Series: ");
        System.out.print(x + ", " + y + ", ");
        for (int i = 2; i <= n; i++) {
            z = y + x;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }

    public static void main(String[] args) {
        StrFib a = new StrFib();
        a.accept();
        a.series();
    }
}
