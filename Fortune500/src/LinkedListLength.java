public class LinkedListLength {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    public int getlength(){
        Node t = head;
        int count = 0;
        while(t!=null){
            count++;
            t=t.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListLength lll = new LinkedListLength();
        lll.push(1);
        lll.push(2);
        lll.push(3);
        lll.push(4);
        int len = lll.getlength();
        System.out.println("The length of the linked list is -->"+len);
    }
}
