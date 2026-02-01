import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
        sc.close();
    }
}
