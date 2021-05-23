public class LinkedListInsertion {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Insert at the beginning
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    //Insert after a given node
    public void insertAfter(int new_data,Node prev_node){
        Node new_node = new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head == null){
            head= new_node;
            return;
        }

        new_node.next=null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }

        last.next= new_node;
    }

    public void printList(){
        Node last = head;
        while(last != null){
            System.out.println(last.data);
            last = last.next;
        }
    }
    public static void main(String[] args) {

        LinkedListInsertion lli = new LinkedListInsertion();
        lli.push(1);
        lli.push(2);
        lli.append(4);
        lli.insertAfter(3,lli.head.next);
        lli.printList();

    }
}
