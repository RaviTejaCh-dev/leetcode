class MyHashMap {

    class Node {
        int key;
        int value;
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] storage;
    private int buckets;
    private int hash(int key){
        return key%buckets;
    }

    public MyHashMap() {
        this.buckets = 10000;
        this.storage = new Node[buckets];

    }

    private Node helper(Node head, int key){
        Node prev = head;
        Node curr = head.next;
        while (curr != null && curr.key != key){
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    public void put(int key, int value) {
        int idx = hash(key);
        if(storage[idx] == null)
            storage[idx] = new Node(-1, -1);

        Node prev = helper(storage[idx], key);
        if(prev.next == null){
            prev.next = new Node(key, value);
        } else{
            prev.next.value = value;
        }
    }

    public int get(int key) {
        int idx = hash(key);
        if(storage[idx] == null)
            return -1;
        Node prev = helper(storage[idx], key);
        if (prev.next == null){
            return -1;
        }
        return prev.next.value;
    }

    public void remove(int key) {
        int idx = hash(key);
        if(storage[idx] == null)
            return;
        Node prev = helper(storage[idx], key);
        if(prev.next  == null)
            return;
        Node temp = prev.next;
        prev.next = prev.next.next;
        temp.next = null;
    }
}