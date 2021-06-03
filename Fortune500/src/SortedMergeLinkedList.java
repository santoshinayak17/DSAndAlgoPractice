public class SortedMergeLinkedList {
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
        Node t= head;
        while(t!= null){
            System.out.println(t.data);
            t=t.next;
        }
    }

    public Node sortedMerge(Node A,Node B){
        if( A== null) return B;
        if (B==null) return A;

        if(A.data<B.data){
            A.next = sortedMerge(A.next,B);
            return A;
        }else{
            B.next = sortedMerge(A,B.next);
            return B;
        }
    }

    public static void main(String[] args) {
        SortedMergeLinkedList list1 = new SortedMergeLinkedList();
        list1.push(15);
        list1.push(10);
        list1.push(5);
        System.out.println("Sorted 1st list-->");
        list1.printList();
        SortedMergeLinkedList list2 = new SortedMergeLinkedList();
        list2.push(20);
        list2.push(3);
        list2.push(2);
        System.out.println("Sorted 2nd list-->");
        list2.printList();

        SortedMergeLinkedList list3 = new SortedMergeLinkedList();
        list3.head=list3.sortedMerge(list1.head,list2.head);
        System.out.println("After merge-->");
        list3.printList();


    }
}
