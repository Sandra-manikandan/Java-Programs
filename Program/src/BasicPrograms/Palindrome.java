package BasicPrograms;
import java.util.*;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        int rev=0,temp=num;
        while(num>0){
            int r=num%10;
           rev=(rev*10)+r;
           num=num/10;
        }
        if(rev==temp){
            System.out.print(temp+" is a Palindrome");
        }
        else{
            System.out.print(temp+" is not  a Palindrome");
        }
    }
}
