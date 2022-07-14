import java.util.*;

class VowelShift {
    String wrd, newwrd;
    int vow_cn = 0, con_cn = 0;
    char[] vow = { 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' };

    VowelShift() {
    }

    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        wrd = sc.next();
        sc.close();
    }

    void freq_vow_con() {
        for (int x = 0; x < wrd.length(); x++)
            if (is_there(vow, wrd.charAt(x)))
                vow_cn++;
            else
                con_cn++;
        System.out.println("Vowel count: " + vow_cn);
        System.out.println("Consonant count: " + con_cn);
    }

    void arrange() {
        StringBuffer vw = new StringBuffer("");// vowels
        StringBuffer con = new StringBuffer("");// consonant
        for (int x = 0; x < wrd.length(); x++) {
            char c = wrd.charAt(x);
            if (is_there(vow, c))
                vw.append(c);
            else
                con.append(c);

        }
        newwrd = String.valueOf(vw) + String.valueOf(con);
    }

    void display() {
        System.out.println("Original Word: " + wrd);
        System.out.println("Rearranged Word: " + newwrd);
    }

    boolean is_there(char[] a, char val) {
        for (int x = 0; x < a.length; x++)
            if (val == a[x])
                return true;
        return false;
    }

    public static void main(String[] args) {
        VowelShift a = new VowelShift();
        a.readword();
        a.freq_vow_con();
        a.arrange();
        a.display();
    }
}