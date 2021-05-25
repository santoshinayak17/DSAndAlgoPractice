public class SwappingLinkedList {
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
        Node t=head;
        while(t!= null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public Node reverse(Node node){
        Node prev=null;
        Node current = head;
        Node next = null;

        while(current != null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        node=prev;
        return node;
    }

    public static void main(String[] args) {

        SwappingLinkedList sll = new SwappingLinkedList();
        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        System.out.println("Before swapping-->");
        sll.printList();
        sll.head= sll.reverse(sll.head);
        System.out.println("After reverse-->");
        sll.printList();


    }
}
