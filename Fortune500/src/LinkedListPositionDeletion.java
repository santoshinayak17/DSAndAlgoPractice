public class LinkedListPositionDeletion {
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

    public void printList(){
        Node t=head;
        while(t!= null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void deleteNode(int position){
        if(head == null){
            return;
        }

        Node temp = head;
        if(position == 0){
            head=temp.next;
            return;
        }

        for(int i=0 ; temp!= null && i< position;i++){
            temp = temp.next;
        }

        if(temp == null || temp.next == null){
            return;
        }

        Node next = temp.next.next;
        temp.next=next;
    }

    public static void main(String[] args) {
        LinkedListPositionDeletion llpd = new LinkedListPositionDeletion();
        llpd.push(1);
        llpd.push(2);
        llpd.push(3);
        llpd.push(4);
        llpd.push(5);
        System.out.println("Before deletion -->");
        llpd.printList();
        llpd.deleteNode(3);
        System.out.println("After deletion-->");
        llpd.printList();

    }
}
