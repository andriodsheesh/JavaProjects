public class linkedlist {
    class Node{
        int data;
        Node next;

        Node (int value){
            data = value;
            next = null;
        }
    }
    Node head;

    void  addfirst(int value){
        Node newNode = new Node (value);
        newNode.next = head;
        head = newNode;
    }

    void addlast(int value){
        Node newNode = new Node (value);

        if(head == null){
            head = newNode;
            return;
        }
    }
    void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
    void deletefirst(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    void deletelast(){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    void removeAtIndex(int position){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if (position < 1){
            System.out.println("Invalid position");
            return;
        }
        Node current = head;
        int count = 0;

        if (position == 1){
            head = current.next;
            return;
        }

        while(current != null && count < position - 1){
            current = current.next;
            count++;
        }

        current.next = current.next.next; 
    }   



}

