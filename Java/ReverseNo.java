import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        int r, s = 0;

        while (no != 0) {
            r = no % 10;
            s = s * 10 + r;
            no = no / 10;
        }

        System.out.println("Reverse: " + s);
    }
}
