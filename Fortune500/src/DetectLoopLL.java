public class DetectLoopLL {
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

    public boolean detectLoop(Node head){
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){
            slow_ptr=slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectLoopLL dl = new DetectLoopLL();
        dl.push(1);
        dl.push(2);
        dl.push(3);
        dl.push(4);
        dl.push(5);

        dl.head.next.next=dl.head;

        if(dl.detectLoop(dl.head)){
            System.out.println("Loop present");
        }else{
            System.out.println("Loop not present");
        }
    }
}
