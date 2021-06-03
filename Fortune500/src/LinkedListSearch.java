public class LinkedListSearch {
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

    public boolean search(int data){
        Node t = head;
        while(t!= null){
            if(t.data == data){
                return true;
            }
            t=t.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedListSearch lls = new LinkedListSearch();
        lls.push(1);
        lls.push(2);
        lls.push(3);
        lls.push(4);
        lls.push(5);

        boolean exist = lls.search(4);
        if(exist){
            System.out.println("Element is exist");
        }else{
            System.out.println("Element is not exist");
        }
    }
}
