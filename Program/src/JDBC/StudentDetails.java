package JDBC;
import java.util.*;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.print("\n1.Insert\n2.Update\n3.Delete\n4.Display\n5.Exit\nEnter option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addDetails();
                    break;

                case 2:
                    service.update();
                    break;

                case 3:
                    service.delete();
                    break;

                case 4:
                    service.display();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}