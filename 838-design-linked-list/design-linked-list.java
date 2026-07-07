class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class MyLinkedList {
    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public int get(int index) {
        if(index>=size || index<0){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else
        {
            temp.next=head;
            head=temp;
            
        }
        size++;
       
    }
    
    public void addAtTail(int val) {
        Node temp=new Node(val);
        if(head==null)head=tail=temp;
        else
        {
            tail.next=temp;
            tail=temp;
            temp.next=null;
        }
        size++;
       
    }
    
    public void addAtIndex(int index, int val) {
        // 3 conditions
        if(index==0)
        {
            addAtHead( val);
            return;
        }
        if(size==index)
        {
            addAtTail(val);
            return;
        }
        if(index<0 || index > size )return;
        Node temp=new Node(val);
        Node x=head;
        for(int i=0;i<index-1;i++)
        {
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {

    if(index < 0 || index >= size)
        return;

    if(index == 0){
        head = head.next;
        size--;

        if(size == 0)
            tail = null;

        return;
    }

    Node temp = head;
    for(int i = 0; i < index - 1; i++){
        temp = temp.next;
    }
    if(temp.next == tail)
        tail = temp;
    temp.next = temp.next.next;
    size--;
}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */