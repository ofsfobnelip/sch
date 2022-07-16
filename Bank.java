import java.util.*;

public class Bank {
    long amt;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        amt = sc.nextLong();
        if (String.valueOf(amt).length() > 5 || amt < 0) {
            System.out.println("Invalid Input");
            System.exit(-1);
        }
        sc.close();
    }

    void name() {
        StringBuffer nm = new StringBuffer();
        String[] names = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
        long tmp = amt;
        while (tmp != 0) {
            long dig = tmp % 10;
            nm.insert(0, names[(int) dig] + " ");
            tmp /= 10;
        }
        nm.delete(nm.length() - 1, nm.length()); // removing last space (optional)
        System.out.println(nm.toString());
    }

    void denomination() {
        long[] order = { 2000, 500, 200, 100, 20, 10, 5, 2, 1 };
        for (int x = 0; x < order.length; x++) {
            long v = amt / order[x];
            if (v != 0) {
                long pr = order[x] * v;
                System.out.println(order[x] + " * " + v + " = " + pr);
                amt -= pr;
            }
        }
    }

    public static void main(String[] args) {
        Bank a = new Bank();
        a.input();
        a.name();
        a.denomination();
    }
}