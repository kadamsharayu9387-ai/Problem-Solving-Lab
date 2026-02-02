import java.util.Scanner;

public class BinaryOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        String num = sc.nextLine();
        boolean flag = true;

        for (int i=0; i<num.length(); i++)
        {
            char ch = num.charAt(i);
            if (ch!='0' && ch!='1')
            {
                flag = false;
            }
        }
        if (flag)
        {
            System.out.println(num + " is a Binary Number.");
        }else {
            System.out.println(num +" is Not a Binary Number.");
        }
    }
}
