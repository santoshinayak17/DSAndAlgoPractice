public class SwappingNodeLL {
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

    public void swapNode(int n1,int n2){
        //assignment
        Node prev1=null;
        Node prev2=null;
        Node curr1=head;
        Node curr2=head;

        //for null chk head
        if(head == null){
            return;
        }

        //if equal then we can't swap
        if(n1 == n2){
            return;
        }

        //store the value in current and prev node
        while(curr1 != null && curr1.data != n1){
            prev1=curr1;
            curr1=curr1.next;
        }

        //store the value in current and prev node
        while(curr2 != null && curr2.data != n2){
            prev2=curr2;
            curr2=curr2.next;
        }

        if(curr1 != null && curr2!= null){
            //store 1ft in 2nd node
            if(prev1 != null){
                prev1.next=curr2;
            }else{
                head=curr2;
            }

            //store 2nd into 1st
            if(prev2 != null){
                prev2.next = curr1;
            }else{
                head=curr1;
            }

            //swap the next elements
            Node temp = curr1.next;
            curr1.next=curr2.next;
            curr2.next = temp;
        }
    }

      public void printList(){
        Node t= head;
        while(t!= null){
            System.out.println(t.data);
            t=t.next;
        }
      }

    public static void main(String[] args) {
        SwappingNodeLL ss = new SwappingNodeLL();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);
        System.out.println("Before swapping-->");
        ss.printList();
        ss.swapNode(2,4);
        System.out.println("After swapping-->");
        ss.printList();
    }
}
