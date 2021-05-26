public class LoopLengthLinkedList {
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

    public int  countLoop(Node n){
        int l=1;
        Node temp = n;
        while(temp.next != n){
            l++;
            temp=temp.next;
        }
        return l;
    }

    public int detectLoop(Node n){
        Node slow_ptr = head;
        Node fast_ptr=head;
        while(slow_ptr != null && fast_ptr != null && fast_ptr.next!= null){
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;
            if(slow_ptr == fast_ptr){
                return countLoop(slow_ptr);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LoopLengthLinkedList lll = new LoopLengthLinkedList();
        lll.push(1);
        lll.push(2);
        lll.push(3);
        lll.push(4);
        lll.push(5);
        lll.push(6);
        lll.push(7);
        lll.push(8);
        lll.head.next.next.next.next = lll.head.next;
        int len = lll.detectLoop(lll.head);
        System.out.println("The length of the loop is -->"+len);
    }
}
