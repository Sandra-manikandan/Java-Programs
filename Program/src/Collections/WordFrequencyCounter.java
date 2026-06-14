package Collections;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence:");
        String str = sc.nextLine();
        WordFrequency wordcount =new  WordFrequency(str);

    }
}

