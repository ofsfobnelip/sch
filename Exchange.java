import java.util.*;

public class Exchange {
    String sent, rev;
    int size;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        sent = sc.nextLine();
        size = sent.length();
        sc.close();
    }

    void exfirstlast() {
        StringTokenizer st = new StringTokenizer(sent, " .");
        StringBuffer str = new StringBuffer();
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            str.append(exchange(s) + " ");
        }
        rev = str.toString();
    }

    void display() {
        System.out.println("Sentence: " + sent);
        System.out.println("Changed Sentence: " + rev);
    }

    private String exchange(String s) {
        StringBuffer a = new StringBuffer(s);
        a.setCharAt(0, s.charAt(s.length() - 1));
        a.setCharAt(s.length() - 1, s.charAt(0));
        return a.toString();
    }

    public static void main(String[] args) {
        Exchange a = new Exchange();
        a.input();
        a.exfirstlast();
        a.display();
    }
}
