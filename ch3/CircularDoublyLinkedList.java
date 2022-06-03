public class CircularDoublyLinkedList<E> {
    private NodeDoubly<E> sentinel = new NodeDoubly<E>(null);
    private int size = 0;

    public CircularDoublyLinkedList(){
        this.sentinel.next = this.sentinel;
        this.sentinel.prev = this.sentinel;
    }
    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return(size == 0);
    }
    public E first(){
        return sentinel.next.element;
    }    
    public E last(){
        return sentinel.prev.element;
    }
    public void addFirst(E element){
        NodeDoubly node = new NodeDoubly<E>(element);
        node.next = this.sentinel.next;
        node.prev = this.sentinel;
        this.sentinel.next = node;
        size++;
    }
    public void addLast(E element){
        NodeDoubly node = new NodeDoubly<E>(element);
        node.next = this.sentinel;
        node.prev = this.sentinel.prev;
        this.sentinel.prev = node;
        size++;
    }
    public E removeFirst(){
        E temp = this.sentinel.next.element;
        this.sentinel.next = this.sentinel.next.next;
        this.sentinel.next.next.prev = this.sentinel;
        return temp;
    }
    public E removeLast(){
        E temp = this.sentinel.prev.element;
        this.sentinel.prev = this.sentinel.prev.prev;
        this.sentinel.prev.prev.next = this.sentinel;
        return temp;
    }

}
