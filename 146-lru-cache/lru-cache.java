class LRUCache {

    class Node
    {
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key,int val)
        {
            this.val=val;
            this.key=key;
        }
    }
   
    // head and tail
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    //HashMap
    HashMap<Integer,Node>map=new HashMap<>();
    int cap=0;


    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        //if(!map.containsKey(key))return -1;
        if(map.containsKey(key))
        {
            Node resNode=map.get(key);
            int res=resNode.val;
            map.remove(key);
            //deleteNode
            deleteNode(resNode);
            //insertNode
            InsertAfterHead(resNode);
            //update map
            map.put(key,head.next);
            return res;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        //if map already contains key
        // Node newHead=new Node(key,value);
        if(map.containsKey(key))
        {
            Node existingNode=map.get(key);
            existingNode.val=value;
            deleteNode(existingNode);
            InsertAfterHead(existingNode);
        }
        // if capacity becomes full
        else 
        {
            if(map.size()==cap)
            {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
            }
            Node newHead=new Node(key,value);
            InsertAfterHead(newHead);
            map.put(key,newHead);
        }
    }

    // function to add node just after head
    public void InsertAfterHead(Node newNode)
    {
        Node temp=head.next;
        head.next=newNode;
        newNode.prev=head;
        newNode.next=temp;
        temp.prev=newNode;  
    }
    public void deleteNode(Node delNode)
    {
        Node delNodePrev=delNode.prev;
        Node delNodeNext=delNode.next;
        delNodePrev.next=delNodeNext;
        delNodeNext.prev=delNodePrev;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */