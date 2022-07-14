import java.util.*;

class ConsShift {
    String wrd, shift_wrd, upper_wrd;

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Word: ");
        wrd = sc.next().toLowerCase();
        sc.close();
    }

    void shiftcosn() {
        StringBuffer vw = new StringBuffer();
        StringBuffer cn = new StringBuffer();
        for (int x = 0; x < wrd.length(); x++) {
            char c = wrd.charAt(x);
            if (is_vowel(c))
                vw.append(c);
            else
                cn.append(c);
        }
        shift_wrd = cn.toString() + vw.toString();
        upper_wrd = cn.toString().toUpperCase() + vw.toString();
    }

    void display() {
        System.out.println("Word: " + wrd);
        System.out.println("Shifted Word: " + shift_wrd);
        System.out.println("Changed Word: " + upper_wrd);
    }

    boolean is_vowel(char val) {
        char[] v = { 'a', 'e', 'i', 'o', 'u' };
        for (int x = 0; x < v.length; x++)
            if (val == v[x])
                return true;
        return false;
    }

    public static void main(String[] args) {
        ConsShift a = new ConsShift();
        a.readword();
        a.shiftcosn();
        a.display();
    }
}