import java.util.*;

public class TheString {
    String sent;
    int len, word_count, cons;

    void readSent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        sent = sc.nextLine();
        if (sent.length() > 100)
            sent = sent.substring(0, 100);
        len = sent.length();
        sc.close();
    }

    void count() {
        StringTokenizer st = new StringTokenizer(sent, " ");
        word_count = st.countTokens();
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            for (int x = 0; x < s.length(); x++)
                if (!is_vowel(s.charAt(x)))
                    cons++;
        }
    }

    void display() {
        System.out.println("Sentence: " + sent);
        System.out.println("Word Count: " + word_count);
        System.out.println("Consonant Count: " + cons);
    }

    boolean is_vowel(char val) {
        val = Character.toUpperCase(val);
        char[] v = { 'A', 'E', 'I', 'O', 'U' };
        for (int x = 0; x < v.length; x++)
            if (val == v[x])
                return true;
        return false;
    }

    public static void main(String[] args) {
        TheString a = new TheString();
        a.readSent();
        a.count();
        a.display();
    }
}
