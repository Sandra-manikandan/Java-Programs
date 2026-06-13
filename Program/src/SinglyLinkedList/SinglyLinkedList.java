import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display()
    {
       Node temp=head;
       while(temp!=null)
       {
           System.out.print(temp.data);
           if(temp.next!=null)
           {
               System.out.print("->");
           }
           temp=temp.next;
       }

    }
}
public class SinglyLinkedList{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList n=new LinkedList();
        System.out.print("Enter the No of node:");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Enter the value:");
            int value=sc.nextInt();
            n.insert(value);
        }
        System.out.println("Linked List");
        n.display();

    }
}
