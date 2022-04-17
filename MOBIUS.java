import java.util.Scanner;

public class MOBIUS {

    public static void main(String[] args) {
        MOBIUS a = new MOBIUS();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 to exit loop");
        int num = -1;
        while (true) {
            System.out.print("Enter number: ");
            num = sc.nextInt();
            if (num == 0)
                break;
            System.out.println("Output of MOBIUS: " + cal(num));
            System.out.println("-------------------------");
        }
        sc.close();
    }

    int cal(int num) {
        if (num == 1)
            return 1;
        int d = 2, vl = -1, cn = 0, t_cn = 0;
        System.out.print("Prime Factors: ");
        while (num != 1) {
            // in this loop the value of d is only prime factors
            if (num % d == 0) {
                num /= d;
                if (cn == 1)
                    vl = 0; // returnig 0 if a factor comes more than once
                cn++; // count of current factors
                t_cn++; // total count of factors
                System.out.print(d + ", ");
            } else {
                d++; // incrementing prime factor
                cn = 0; // resetting the count if factor changes
            }
        }
        System.out.println();
        if (vl != 0)
            return (int) (Math.pow(-1, t_cn));
        return vl;
    }
}
