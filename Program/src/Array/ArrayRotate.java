import java.util.*;
public class ArrayRotate {
    void rotation(int[] arr){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of times to rotate");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            int first=arr[0];
            for(int j=0;j< arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }
        System.out.println("Array after rotation:");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
