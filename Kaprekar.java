import java.util.Scanner;

class Kaprekar {
    public static void main(String[] args) {
        Kaprekar a = new Kaprekar();
        a.input();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (is_kapr(n))
            System.out.println("Is a Kaprekar number");
        else
            System.out.println("Is not a Kaprekar number");
        sc.close();
    }

    boolean is_kapr(int n) {
        String nm = String.valueOf(n*n); // number converted to a string
        int ln = nm.length(), first = 0, second = 0;
        first = Integer.parseInt(nm.substring(0, ln / 2));
        second = Integer.parseInt(nm.substring(ln / 2));
        return first + second == n;
    }
}
