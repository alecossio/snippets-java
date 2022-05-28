public class SinglyLinkedList <E>{
    private class Node<E>{               //investigar: por que la nested class must be static?
        private E element;
        private Node<E> next;                   //repasar: generics

        public Node(E element){
            this.element = element;
        }

        public E get(int n){
            if(n == 0)
                return element;
            else
                return next.get(n-1);
        }
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){
        //TODO
    }

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public E first() {
        return head.element;
    }
    public E last() {
        return tail.element;
    }
    public void addFirst(E element){
        Node<E> newNode = new Node<>(element);
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public void addLast(E element){
        Node<E> newNode = new Node<>(element);
        newNode.next = null;
        if(this.isEmpty())
            this.head = newNode;
        else
            this.tail.next = newNode;
        this.tail = newNode;
        this.size++;
    }
    public E removeFirst(){
        if(this.head == null)
            return null;
        else{
            Node<E> t = this.head;
            this.head = this.head.next;
            this.size--;
            return t.element;
        }
    }

    public E getHead() {
        return head.element;
    }

    public E getTail() {
        return tail.element;
    }

    public E get(int n) throws IllegalArgumentException{
        if(n < 0 || n > (this.size-1)) throw new IllegalArgumentException();
        else
            return this.head.get(n);
    }

}
