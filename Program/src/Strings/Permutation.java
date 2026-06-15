package Strings;
import java.util.*;

public class Permutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String:");
        String str=sc.nextLine();
        int len=str.length();
        System.out.println("All the permutations of the string are:");

        GeneratePermutation permuation=new GeneratePermutation();
        permuation.generatePermutation(str,0,len);
    }
}
