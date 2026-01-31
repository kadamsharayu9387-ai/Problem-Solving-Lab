import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        int sq, cu, no;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        no = sc.nextInt();

        sq = no * no;
        cu = no * no * no;

        System.out.println("Square of number: " + sq);
        System.out.println("Cube of number: " + cu);

        sc.close();
    }
}
