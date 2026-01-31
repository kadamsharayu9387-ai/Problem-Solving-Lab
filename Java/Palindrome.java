import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no = sc.nextInt();  

        int temp = no;  
        int s = 0;      
        int r;          

        while (no != 0) 
        {
            r = no % 10;      
            s = s * 10 + r;   
            no = no / 10;     
        }

        if (s == temp) {
            System.out.println(temp + " is a Palindrome");
        } else {
            System.out.println(temp + " is NOT a Palindrome");
        }
    }
}
