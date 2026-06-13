import java.util.*;
public class DuplicateElement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of an array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the No of Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Duplicate dup=new Duplicate();
        dup.duplicateElement(arr);
    }
}
