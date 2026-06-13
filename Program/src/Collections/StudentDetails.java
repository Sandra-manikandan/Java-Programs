import java.util.*;
public class StudentDetails {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       ArrayList<Student> student= new ArrayList<Student>();
        StudentService service=new StudentService();
        while(true) {
            System.out.print("1.Insert\n2.update\n3.Delete\n4.Display\n5.exit \nEnter a Option:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    service.addDetails(student);
                    break;
                case 2:
                    service.update(student);
                    break;
                case 3:
                    service.delete(student);
                    break;
                case 4:
                        service.display(student);
                    break;
                case 5:
                    return;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
}
