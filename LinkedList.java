public class LinkedList {
    public class Node(
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    )
    void insertAtfirst(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;

    }
    void insertAtlast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    voi insertAtindex(int data,int index)
    {
        Node
    }
}
