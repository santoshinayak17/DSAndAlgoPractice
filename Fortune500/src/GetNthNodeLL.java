public class GetNthNodeLL {
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

    public int getNth(int position){
        Node t = head;
        int count = 0;

        while(t!=null){
            if(count == position){
                return t.data;
            }
            count++;
            t=t.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        GetNthNodeLL ll = new GetNthNodeLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);

        int element = ll.getNth(3);
        System.out.println("The Element at 3rd position is -->"+element);
    }
}
