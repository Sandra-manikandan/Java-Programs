import java.util.*;

public class LeftRotate {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        ArrayRotate rotate=new ArrayRotate();
        rotate.rotation(arr);
    }
}
