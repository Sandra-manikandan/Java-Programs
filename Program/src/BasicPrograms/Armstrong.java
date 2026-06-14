package BasicPrograms;
import java.util.*;
import java.lang.Math;
class isArmstrongCheck{
    void isArmstrong(int num) {
        int temp = num, digits = 0, sum = 0;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = num;
        while (temp > 0) {
            int last = temp % 10;
            sum += (int)(Math.pow(last, digits));
            temp=temp/10;
        }

        if (sum == num) {
            System.out.println(num + " is a Armstrong");
            return;
        }

    }
}

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit:");
        int num = sc.nextInt();
        isArmstrongCheck n=new isArmstrongCheck();
        for(int i=0;i<=num;i++){
            n.isArmstrong(i);
        }

    }
}
