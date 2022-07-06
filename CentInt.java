import java.util.Scanner;

class CentInt {
    int[] num;

    public static void main(String[] args) {
        CentInt a = new CentInt();
        a.input();
        a.sort(a.num);
        a.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Elements: ");
        int len = sc.nextInt();
        num = new int[len];
        System.out.println("Enter Elements of Array:");
        for (int x = 0; x < num.length; x++)
            num[x] = sc.nextInt();
        sc.close();
    }

    void display() {
        System.out.println("Output:");
        for (int x = 0; x < num.length; x++)
            System.out.print(num[x] + (x != num.length - 1 ? ", " : ""));
        System.out.println();
    }

    int[] sort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if (arr[y] > arr[y + 1]) {
                    int tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                }
            }
        }
        return arr;
    }
}
