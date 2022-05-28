public class SinglyLinkedList <E>{
    private static class Node<E>{               //investigar: por que la nested class must be static?
        private E element;
        private Node<E> next;                   //repasar: generics

        public Node(E element){
            this.element = element;
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
        if(head == null)
            return true;
        else   
            return false;
    }
    public Node<E> first() {
        return head;
    }
    public Node<E> last() {
        return tail;
    }
    public void addFirst(Node<E> newNode){
        newNode.next = this.head;
        this.head = newNode;
        this.size++;
    }
    public void addLast(Node<E> newNode){
        newNode.next = null;
        this.tail.next = newNode;
        this.tail = newNode;
        this.size++;
    }
    public Node<E> removeFirst(){
        if(this.head == null)
            return null;
        else{
            Node<E> t = this.head;
            this.head = this.head.next;
            this.size--;
            return t;
        }
    }


}
