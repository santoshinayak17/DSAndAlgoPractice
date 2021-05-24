public class ElementFrequencyLL {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next= null;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next= head;
        head = new_node;
    }

    public int findFrequency(int d){
        Node t = head;
        int count = 0;
        while(t != null){
            if(t.data == d){
                count++;
            }
            t=t.next;
        }
        return count;
    }

    public static void main(String[] args) {
        ElementFrequencyLL ll = new ElementFrequencyLL();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(2);
        ll.push(3);
        ll.push(3);
        ll.push(3);
        ll.push(3);
        ll.push(3);
        ll.push(4);

        int frequency = ll.findFrequency(3);
        System.out.println("The number of times 3 present is -->"+frequency);

    }
}
