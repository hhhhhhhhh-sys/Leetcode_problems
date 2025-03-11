import java.util.Scanner;

public class palindrome {
    public static int numPalin(int n) {
        int myNum = n;
        int rev = 0;
        int d = n % 10;
        while (n > 0) {
              
            rev = rev * 10 + d; 
            n /= 10;  
        }

        return rev; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int reversedNumber = numPalin(n);  

        if (reversedNumber == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

          
    }
}
