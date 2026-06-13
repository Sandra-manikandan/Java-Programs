package BasicPrograms;
import java.util.*;


public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No:");
        int num = sc.nextInt();
        if (num == 0 || num == 1) {
            System.out.print(num + " is not Prime Number");
            return;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(num + " is not Prime Number");
                return;
            }
        }
        System.out.println(num + " is a Prime Number ");
    }
}
