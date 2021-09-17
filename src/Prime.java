import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (checkPrime(number)) {
            System.out.println(" is a prime");
        }
        else {
            System.out.println("is not a prime");
        }
    }
    public static boolean checkPrime (int n) {
        if (n < 2) {
            return false;
        }
        else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return  true;
        }
    }
}
