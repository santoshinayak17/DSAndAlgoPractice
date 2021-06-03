public class MiddleElementLL {
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
        new_node.next= head;
        head=new_node;
    }

    public int middleElement(){
        Node slow_ptr = head;
        Node fast_ptr = head;

        while(fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr= slow_ptr.next;
        }

        return slow_ptr.data;
    }

    public static void main(String[] args) {
        MiddleElementLL ll = new MiddleElementLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);

        int middle = ll.middleElement();
        System.out.println("The middle element of the linked list -->"+middle);
    }
}
