public class RemDuplicateUnsortLL {
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
        while(t != null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public void removeDuplicate(){
        Node ptr1=null;
        Node ptr2=null;
        Node dup = null;

        ptr1=head;
        while (ptr1 != null && ptr1.next != null){
            ptr2=ptr1;
            while(ptr2.next!= null){
                if(ptr1.data == ptr2.next.data){
                    dup=ptr2.next;
                    ptr2.next=ptr2.next.next;
                    System.gc();
                }else{
                    ptr2=ptr2.next;
                }
            }

            ptr1=ptr1.next;
        }
    }

    public static void main(String[] args) {
        RemDuplicateUnsortLL rr = new RemDuplicateUnsortLL();
        rr.push(1);
        rr.push(2);
        rr.push(3);
        rr.push(2);
        rr.push(4);
        rr.push(5);
        rr.push(2);
        System.out.println("Before remove");
        rr.printList();
        System.out.println("After remove");
        rr.removeDuplicate();
        rr.printList();

    }
}
