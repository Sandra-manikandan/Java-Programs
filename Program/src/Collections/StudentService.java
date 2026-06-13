import java.util.*;

public class StudentService implements Service {
    Scanner sc = new Scanner(System.in);

    public void addDetails(ArrayList<Student> student) {
        System.out.print("Enter Roll No:");
        int roll_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Total Mark:");
        int total_mark = sc.nextInt();
        System.out.println("Inserted Successfully");
        Student stud= new Student(name,roll_no,total_mark);
        student.add(stud);
    }

    public void update(ArrayList<Student> student) {
        System.out.print("Enter Roll No:");
        int newRollno = sc.nextInt();
        sc.nextLine();
        int flag = 0;
        for (Student stud : student) {
            if (stud.roll_no == newRollno) {
                flag = 1;
                System.out.print("Enter new Name:");
                stud.name = sc.nextLine();
                System.out.print("Enter  Updated Total Mark:");
                stud.total_mark = sc.nextInt();
                System.out.println("Updated Successfully");
            }
        }
        if (flag == 0) {
            System.out.println("Student is not present");
        }

    }

    public void delete(ArrayList<Student> student) {
        int Flag = 0;
        Iterator<Student> it = student.iterator();
        System.out.print("Enter Roll No:");
        int new_Rollno = sc.nextInt();
        while (it.hasNext()) {
            Student stud = it.next();
            if (stud.roll_no == new_Rollno) {
                Flag = 1;
                it.remove();
                System.out.println("Deleted Successfully");
            }
        }
        if (Flag == 0) {
            System.out.println("Student is not present");
        }
    }
    public void display(ArrayList<Student> student) {
        for (Student st : student) {
            System.out.println("Roll_no:" + st.roll_no + " Name:" + st.name + " TotalMark:" + st.total_mark);
        }
    }

}

