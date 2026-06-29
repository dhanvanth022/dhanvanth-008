import java.util.Scanner;

public class PalindromeString {
    
    public static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(isPalindrome(str)){
            System.out.println(str+" Is a palindrome");
        }else{
            System.out.println(str+" Is not a palindrome");
        }
    }
}
