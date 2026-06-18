package JDBC;
import java.util.*;

public class RemoveDuplicates {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter the Total No of Elements:");
        int n=sc.nextInt();
        System.out.println("Enter the  Elements:");
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());

        }
        Duplicate dup=new Duplicate(list);
    }
}
