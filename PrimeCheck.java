
import java.util.Scanner;

class PrimeCheck{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        if(n == 2){
            return true;
        }

        if(n % 2 == 0){
            return false;
        }

        for(int i = 3; i * i <= n;i+=2){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if(isPrime(number)){
            System.out.println(number+" is a Prime");
        } else {
            System.out.println(number +" is not a prime");
        }
    }
}