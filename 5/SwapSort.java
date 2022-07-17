import java.util.*;

class SwapSort {
    String wrd, swapwrd, sortwrd;
    int len;

    void readstring() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        wrd = sc.next();
        len = wrd.length();
        sc.close();
    }

    void swapchar() {
        StringBuffer a = new StringBuffer(wrd);
        a.setCharAt(0, wrd.charAt(len - 1));
        a.setCharAt(len - 1, wrd.charAt(0));
        swapwrd = a.toString();
    }

    void sortword() {
        char[] arr = wrd.toCharArray();
        for (int x = 0; x < len - 1; x++)
            for (int y = 0; y < len - 1 - x; y++)
                if (arr[y] > arr[y + 1]) {
                    char tmp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = tmp;
                }
        sortwrd = String.valueOf(arr);
    }

    void display() {
        System.out.println("Word: " + wrd);
        System.out.println("Swapped Word: " + swapwrd);
        System.out.println("Sorted Word: " + sortwrd);
    }

    public static void main(String[] args) {
        SwapSort a = new SwapSort();
        a.readstring();
        a.swapchar();
        a.sortword();
        a.display();
    }
}