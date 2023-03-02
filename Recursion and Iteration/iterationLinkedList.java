public class iterationLinkedList {
    public static void main(String[] args) {
        class Node {
            public int value;
            public Node next;
            
            public Node(int value) {
                this.value = value;
                this.next = null;
            }
        }
        
        class LinkedList {
            public Node head;
            
            public LinkedList() {
                this.head = null;
            }
            
            public void add(int value) {
                Node newNode = new Node(value);
                
                if (this.head == null) {
                    this.head = newNode;
                } else {
                    Node current = this.head;
                    
                    while (current.next != null) {
                        current = current.next;
                    }
                    
                    current.next = newNode;
                }
            }
            
            public void remove(int value) {
                if (this.head == null) {
                    return;
                }
                
                if (this.head.value == value) {
                    this.head = this.head.next;
                    return;
                }
                
                Node current = this.head;
                
                while (current.next != null) {
                    if (current.next.value == value) {
                        current.next = current.next.next;
                        return;
                    }
                    
                    current = current.next;
                }
            }
            
            public boolean contains(int value) {
                Node current = this.head;
                
                while (current != null) {
                    if (current.value == value) {
                        return true;
                    }
                    
                    current = current.next;
                }
                
                return false;
            }
        }
    }
    
}
