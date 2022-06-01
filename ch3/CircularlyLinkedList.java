public class CircularlyLinkedList<E> {
    private Node<E> tail = null;
    private int size = 0;

    public void rotate(){
        this.tail = this.tail.next;
    }
    public boolean isEmpty(){
        return tail == null;
    }
    public int size(){
        return this.size;
    }
    public void addLast(E element){
        Node<E> newNode = new Node<>(element);
        if(this.tail == null){
            newNode.next = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.tail.next;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    public void addFirst(E element){
        Node<E> newNode = new Node<>(element);
        if(this.tail == null){
            newNode.next = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.tail.next.next;
            this.tail.next = newNode;
        }
        this.size++;
    }
    public E removeFirst(){
        if(this.size<1) throw new IllegalArgumentException();
        E temp = this.tail.next.element;
        this.tail.next = this.tail.next.next;
        this.size--;
        return temp;
    }
    public E first(){
        return this.tail.next.element;
    }
    public E last(){
        return this.tail.element;
    }
    public E get(int n) throws IllegalArgumentException{
        if(n < 0 || n > (this.size-1)) throw new IllegalArgumentException();
        else
            return this.tail.next.get(n);
    }
    public int calculateSize(){
        if(tail == null)
            return 0;
        int size = 1;
        Node<E> node = tail.next;;
        while(node != tail){
            size++;
            node = node.next;
        }
        return size;
    }

    @Override
    public boolean equals(Object other){
        if(other.getClass() != this.getClass())
            throw new IllegalArgumentException("Cannot compare object of different class");
        CircularlyLinkedList otherCLL = (CircularlyLinkedList)other;
        if(otherCLL.size() != this.size()){
            System.out.println("size mismatch");
            return false;
        }
        for(int i = 0; i < this.size(); i++){
            if(this.get(i) != otherCLL.get(i)){
                System.out.println("element mismatch at:" + i);
                return false;
            }
        }
        return true;
    }
}
