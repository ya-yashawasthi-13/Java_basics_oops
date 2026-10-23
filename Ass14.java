public class Ass14 {
    public static void main(String[] args) {

        String str = "aabbcccddddd";
        int max1 = 0, max2 = 0;
        char ch1 = ' ', ch2 = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (str.indexOf(ch) != i) {
                continue;
            }

            if (count > max1) {
                max2 = max1;
                ch2 = ch1;
                max1 = count;
                ch1 = ch;
            } else if (count > max2 && count < max1) {
                max2 = count;
                ch2 = ch;
            }
        }

        if (max2 == 0) {
            System.out.println("No second most frequent character");
        } else {
            System.out.println("Second most frequent character: " + ch2);
            System.out.println("Frequency: " + max2);
        }
    }
}
