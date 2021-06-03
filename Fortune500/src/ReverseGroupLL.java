public class ReverseGroupLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void push( int new_data){
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

    public Node reverse(Node head,int k){
        if(head == null){
            return null;
        }

        Node prev = null;
        Node current =head;
        Node next = null;
        int count =0;

        while(current != null && count <k){
            next = current.next;
            current.next = prev;
            prev=current;
            current = next;
            count++;
        }

        if(next != null){
            head.next= reverse(next,k);
        }

        return prev;
    }

    public static void main(String[] args) {
        ReverseGroupLL rg = new ReverseGroupLL();
        rg.push(1);
        rg.push(2);
        rg.push(3);
        rg.push(4);
        rg.push(5);

        System.out.println("Given Linked List-->");
        rg.printList();

        rg.head=rg.reverse(rg.head,2);
        System.out.println("After reverse-->");
        rg.printList();
    }
}
