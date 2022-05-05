import java.util.Scanner;

class Smith {

    public static void main(String[] args) {
        Smith a = new Smith();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if (check(num))
            System.out.println("Is a Smith number");
        else
            System.out.println("Is not a Smith number");
        sc.close();
    }

    boolean check(int num) {
        int sm = dig_sum(num); // sum of digits of the number
        int pr_sm = 0; // sum of the digits of the prime number
        int d = 2;
        while (num != 1) {
            if (num % d == 0) {
                pr_sm += dig_sum(d);
                num /= d;
            } else
                d++;
        }
        return pr_sm == sm;
    }

    int dig_sum(int n) {
        int r = 0;
        while (n != 0) {
            r += (n % 10);
            n /= 10;
        }
        return r;
    }
}