public class SinglyLinkedList <E>{
    protected class Node<E>{               //investigar: por que la nested class must be static?
        protected E element;
        protected Node<E> next;                   //repasar: generics

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
    protected Node<E> head = null;
    protected Node<E> tail = null;
    protected int size = 0;

    public SinglyLinkedList(){
    }

    public int size(){
        return this.size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public E first() {
        if(this.isEmpty())
            return null;
        return head.element;
    }
    public E last() {
        if(this.isEmpty())
            return null;    
        return tail.element;
    }
    public void addFirst(E element){
        Node<E> newNode = new Node<>(element);
        newNode.next = this.head;
        this.head = newNode;
        if(this.isEmpty())
            this.tail = this.head;
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

    public E get(int n) throws IllegalArgumentException{
        if(n < 0 || n > (this.size-1)) throw new IllegalArgumentException();
        else
            return this.head.get(n);
    }

}
