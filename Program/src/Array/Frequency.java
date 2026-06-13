import java.util.*;

public class Frequency{
    Frequency(int[] arr)
    {
        int visited=-1;
        int[] frequency=new int[arr.length];
        for(int i=0;i< arr.length-1;i++){
            int count=1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j]=visited;
                }
                if(frequency[i]!=visited){
                    frequency[i]=count;
                }
            }
        }
        System.out.println("Frequench of each element:");
        for(int i=0;i< arr.length;i++) {
            if (frequency[i] != visited) {
                System.out.println(arr[i] + "=" + frequency[i]);
            }
        }
    }
}
