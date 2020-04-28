class FirstUnique {
    class Node {
        int value;
        Node prev;
        Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    
    Map<Integer, Integer>  count;
    Node head, tail;
    public FirstUnique(int[] nums) {
        count = new HashMap<Integer, Integer>();
        head = null;
        tail = null;
        for (int num: nums) {
            add(num);
        }
    }
    
    public int showFirstUnique() {
        return head!=null? head.value: -1;
    }
    
    public void add(int num) {
        if (!count.containsKey(num)) {
            //if unique, adding to linkedlist
            Node current = new Node(num);
            if (head==null) {
                //first element in the list
                head = current;
                tail = current;
            } else {
                tail.next = current;
                current.prev = tail;
                tail = current;
            }            
        } else  if (count.get(num)==1){
            //if duplicate, removing from linkedlist
            Node current = head;
            if (head==tail) {
                //only 1 element
                head = null;
                tail = null;
            } else if (head.next == tail) {
                if (head.value==num) {
                    head = tail;
                    tail.prev = null;
                } else {
                    tail = head;
                    head.next = null;
                }
            } else {
                while (current.value!=num) {
                    current = current.next;
                }  
                if (current.prev!=null) {
                    current.prev.next = current.next;
                } else {
                    //deleting first element
                    head = current.next;
                    head.prev = null;
                }
                if (current.next!=null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                    tail.next = null;
                }
            }

            
            
        }
        if (count.containsKey(num)) {
            count.put(num, count.get(num)+1);
        } else {
                count.put(num, 1);
        }       
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */
