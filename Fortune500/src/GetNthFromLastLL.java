public class GetNthFromLastLL {
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
        head= new_node;
    }

    public int getNthFromlast(int position){

        int len = 0;
        Node t = head;
        while(t != null){
            len++;
            t=t.next;
        }

        if(len < position){
            return -1;
        }

        Node temp = head;

        for(int i=1;i< len-position+1;i++){
            temp = temp.next;
        }

        return temp.data;
    }

    public static void main(String[] args) {
        GetNthFromLastLL ll = new GetNthFromLastLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);

        int elem = ll.getNthFromlast(2);

        System.out.println("Element of 2nd last-->"+elem);
    }
}
