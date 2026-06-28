import java.util.Scanner;

public class PalindromeCheck {
    
    public static boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;

        while( n > 0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n =n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(isPalindrome(number)){
            System.out.println(number+" Is a palindrome");
        }else{
            System.out.println(number+" Is not a palindrome");
        }
    }
}
