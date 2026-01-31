import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        String num = sc.next();

        if (num.charAt(0)=='0'){
            System.out.println(num + " is Not a Duck Number");
        } else if (num.contains("0")) {
            System.out.println(num + " is Duck Number");
        }else {
            System.out.println(num + " is Not a Duck Number");
        }
    }
}
