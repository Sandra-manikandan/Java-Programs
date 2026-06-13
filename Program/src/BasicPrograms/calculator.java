import java.util.*;
class cal{
    int[] num;
    int n;
    void inputt() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Inputs");
        n = sc.nextInt();
        num=new int[n];
        System.out.print("Enter Inputs");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
    }
    void add()
    {
        inputt();
       int result=0;
       for(int i=0;i<n;i++)
       {
           result+=num[i];
       }
        System.out.print("Result is:"+result);
    }
    void substract()
    {
        inputt();
        int result=num[0];
        for(int i=1;i<n;i++)
        {
            result-=num[i];
        }
        System.out.print("Result is:"+result);
    }
    void multiply()
    {
        inputt();
        int result=1;
        for(int i=0;i<n;i++)
        {
            result*=num[i];
        }
        System.out.print("Result is:"+result);
    }

    void division()
    {
        inputt();
        int result=num[0];
        try
        {

            for (int i = 1; i < n; i++)
            {
//                if (num[i] == 0)
//                {
//                    throw new ArithmeticException("Can't Divide by Zero");
//                }
                result /= num[i];
            }
        } catch (ArithmeticException e) {
            System.out.println("Can't Divide by Zero");
            return;
        }
        System.out.print("Result is:"+result);
    }



}
public class calculator {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        cal c=new cal();
        while(true)
        {
            System.out.print("\n1.Addition\n2.Substraction" +
                    "\n3.Multiplication\n4.Division\n5.Exit\nChoose a operation:");
            int n=s.nextInt();
            switch (n)
            {
                case 1:
                    c.add();
                    break;
                case 2:
                    c.substract();
                    break;
                case 3:
                    c.multiply();
                    break;
                case 4:
                    c.division();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");

            }

        }

        }
}