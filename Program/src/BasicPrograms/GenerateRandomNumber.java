package BasicPrograms;
import java.lang.Math;
import java.util.*;

public class GenerateRandomNumber {
    public static void main(String[] args)
    {
// Generating random numbers
        System.out.println("1st Random Number: " + Math.random());
        System.out.println("2nd Random Number: " + Math.random());
 // Generate random double value from 200 to 400
        int min = 200;
        int max = 400;
        System.out.println("Random value of type double between "+min+" to "+max+ ":");
        double a = Math.random()*(max-min+1)+min;
        System.out.println(a);

    }
}
