package Day2;

public class Pb40 {
	public static void main(String[] args) {
        char[] ch = {'@', 'A', '#', '7', '$', 'm'};
        lastSpecial(ch);
    }

    public static void lastSpecial(char[] c) {
        for (int i = c.length - 1; i >= 0; i--) {
            if (!(c[i] >= 'A' && c[i] <= 'Z') &&
                !(c[i] >= 'a' && c[i] <= 'z') &&
                !(c[i] >= '0' && c[i] <= '9')) {
                System.out.println(c[i]);
                break;
            }
        }
    }
}
