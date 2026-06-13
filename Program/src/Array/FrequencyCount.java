
import java.util.*;

public class FrequencyCount{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int num=sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter the elements of array:");
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        Frequency fre= new Frequency(arr);

    }
}
