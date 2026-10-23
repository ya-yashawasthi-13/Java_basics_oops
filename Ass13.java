
public class Ass13 {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        System.out.print("Common characters: ");

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1 && s1.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }

        System.out.print("\nDifferent characters: ");

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (s2.indexOf(ch) == -1 && s1.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (s1.indexOf(ch) == -1 && s2.indexOf(ch) == i) {
                System.out.print(ch + " ");
            }
        }
    }
}
