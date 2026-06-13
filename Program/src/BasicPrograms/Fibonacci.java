import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the No of terms:");
        int n=sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int temp=b;
            b=a+b;
            a=temp;
        }

    }
}