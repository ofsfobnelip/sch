import java.util.*;

public class Capital {
    String sent;
    int freq;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        sent = sc.nextLine();
        sc.close();
    }

    boolean isCap(String s) {
        char c = s.charAt(0);
        if (c >= 'A' && c <= 'Z')
            return true;
        return false;
    }

    void display() {
        StringTokenizer st = new StringTokenizer(sent, " ");
        while (st.hasMoreTokens())
            if (isCap(st.nextToken()))
                freq++;
        System.out.println("Sentence: " + sent);
        System.out.println("Freequency: " + freq);
    }

    public static void main(String[] args) {
        Capital a = new Capital();
        a.input();
        a.display();
    }
}
