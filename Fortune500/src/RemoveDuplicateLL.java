public class RemoveDuplicateLL {
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

    public void removeDuplicate(){
        Node curr=head;
        while(curr != null){
            Node temp = curr;
            while (temp != null && temp.data == curr.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }

    public void printList(){
        Node t=head;
        while (t != null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicateLL rdll = new RemoveDuplicateLL();
        rdll.push(1);
        rdll.push(2);
        rdll.push(3);
        rdll.push(3);
        rdll.push(3);
        rdll.push(4);
        System.out.println("Before removing");
        rdll.printList();
        System.out.println("After removing");
        rdll.removeDuplicate();
        rdll.printList();
    }
}
