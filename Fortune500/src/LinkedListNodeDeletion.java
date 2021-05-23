public class LinkedListNodeDeletion {
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
        head= new_node;
    }

    public void printList(){
        Node tnode = head;
        while(tnode != null){
            System.out.println(tnode.data);
            tnode= tnode.next;
        }
    }

    public  void deleteNode(int data){
        Node temp = head, prev = null;

        if(temp != null && temp.data == data){
            head = temp.next;
            return;
        }

        while(temp != null && temp.data == data){
            prev=temp;
            temp = temp.next;
        }

        if (temp == null) {
         return;
        }

        prev.next=temp.next;
    }

    public static void main(String[] args) {
        LinkedListNodeDeletion lld = new LinkedListNodeDeletion();
        lld.push(1);
        lld.push(2);
        lld.push(3);
        lld.push(4);
        lld.push(5);
        System.out.println("Before deletion -->");
        lld.printList();
        lld.deleteNode(5);
        System.out.println("After deletion--->");
        lld.printList();
    }
}
