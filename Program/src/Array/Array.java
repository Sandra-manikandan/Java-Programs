import java.util.*;
public class Array{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String str=sc.nextLine();
        String[] str1=str.trim().split("\\s");
        int count=str.trim().isEmpty()?0:str1.length;
        System.out.println(count);
        int c=0;

        for(int i=0;i<str1.length;i++){
            for(int j=str1.length-1;j>i;j--)
            {
                if(str1[i].equals(str1[j]))
                {
                    c++;
                }
            }
        }
        System.out.println("No of duplicate words:"+c);
        char[] dup=str.toCharArray();
        int c1=0;
        System.out.println(" duplicate letters:");
        for(int i=0;i<dup.length;i++)
        {
            c1=0;
            for(int j=i+1;j<dup.length;j++)
            {
                if(dup[i]==dup[j] && dup[i]!=' ')
                {
                    c1++;
                    dup[j]='0';
                }
            }
            if(c1>0 && dup[i]!='0'){
                System.out.println(dup[i]);
            }
        }
    }
}
