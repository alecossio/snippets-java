public class DoublyLinkedList<E> {
    private NodeDoubly<E> header = new NodeDoubly<E>(null);
    private NodeDoubly<E> trailer = new NodeDoubly<E>(null);
    private int size = 0;

    public DoublyLinkedList(){
        this.header.next = trailer;
        this.trailer.prev = header;
    }

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return(size == 0);
    }
    public E first(){
        return this.header.next.element;
    }
    public E last(){
        return this.trailer.prev.element;
    }
    public void addFirst(E element){
        NodeDoubly<E> newNode = new NodeDoubly<>(element);
        newNode.prev = header;
        newNode.next = header.next;
        header.next = newNode;
        size++;
    }
    public void addLast(E element){
        NodeDoubly<E> newNode = new NodeDoubly<>(element);
        newNode.next = trailer;
        newNode.prev = trailer.prev;
        trailer.prev = newNode;
        size++;
    }
    public E removeFirst(){
        E temp = header.next.element;
        header.next = header.next.next;
        header.next.next.prev = header;
        size--;
        return temp;
    }
    public E removeLast(){
        E temp = trailer.prev.element;
        trailer.prev = trailer.prev.prev;
        trailer.prev.prev.next = trailer;
        size--;
        return temp;
    }
    public E get(int i){
        E t;
        if(i < size/2){
            System.out.println("forward getting");
            t = header.next.get(i);
        }
        else
            t = trailer.prev.revGet(i);
        return t;
    }
}
