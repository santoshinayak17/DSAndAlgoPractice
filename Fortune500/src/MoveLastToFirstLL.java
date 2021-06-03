public class MoveLastToFirstLL {
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
        new_node.next = head;
        head=new_node;
    }

    public void printList(){
        Node t = head;
        while(t!= null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void moveLastToFirst(){
        if(head == null || head.next == null){
            return;
        }
        Node last= head;
        Node secLast = null;

        while(last.next != null){
            secLast = last;
            last=last.next;
        }
        secLast.next = null;
        last.next = head;
        head=last;
    }

    public static void main(String[] args) {
        MoveLastToFirstLL lm = new MoveLastToFirstLL();
        lm.push(1);
        lm.push(2);
        lm.push(3);
        lm.push(4);
        System.out.println("Before move");
        lm.printList();
        System.out.println("After move");
        lm.moveLastToFirst();
        lm.printList();
    }
}
