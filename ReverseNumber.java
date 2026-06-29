import java.util.Scanner;

public class ReverseNumber {
    
    public static int reversed(int n){
        int reversed = 0;

        while(n!=0){
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n/ 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(reversed(number));
    }
}
