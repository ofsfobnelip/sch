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

    void display() {
        StringTokenizer st = new StringTokenizer(sent, " .");
        while (st.hasMoreTokens())
            if (Character.isUpperCase(st.nextToken().charAt(0)))
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
