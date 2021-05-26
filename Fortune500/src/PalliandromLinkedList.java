import java.util.Stack;

public class PalliandromLinkedList {
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
        while (t != null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public boolean isPalliandrom(Node head){
        Node slow = head;
        boolean ispallian = true;
        Stack<Integer> ss = new Stack<>();
        while(slow != null){
            ss.push(slow.data);
            slow=slow.next;
        }

        while(head != null){
            int i = ss.pop();
            if(head.data == i){
                ispallian=true;
            }else{
                ispallian = false;
                break;
            }
        head=head.next;
        }
        return ispallian;
    }

    public static void main(String[] args) {
        PalliandromLinkedList pll = new PalliandromLinkedList();
        pll.push(1);
        pll.push(2);
        pll.push(3);
        pll.push(4);
        pll.push(3);
        pll.push(2);
        pll.push(1);

        if(pll.isPalliandrom(pll.head)){
            System.out.println("Palliandeom");
        }else{
            System.out.println("Not palliandrom");
        }

        pll.printList();
    }
}
