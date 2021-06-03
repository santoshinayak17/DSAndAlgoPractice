public class PairWiseSwapLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public void printList(){
        Node t = head;
        while(t != null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void pairWiseSwap(){
        Node temp = head;
        while( temp != null && temp.next != null){
            int k = temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }

    public static void main(String[] args) {
        PairWiseSwapLL ll = new PairWiseSwapLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);
        System.out.println("Before swap");
        ll.printList();
        System.out.println("After swap");
        ll.pairWiseSwap();
        ll.printList();
    }
}
