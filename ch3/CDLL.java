public class CDLL<E> {
    int size = 0;
    private NodeDoubly<E> h;

    public CDLL(){ 
        this.h = new NodeDoubly<E>(null);
        h.next = h;
        h.prev = h;
    }
    public int size(){ return this.size; }
    public boolean isEmpty() { return this.size==0; }
    public void addFirst(E element){
        if(h.element == null){
            h.element = element;
            
        }else{
            NodeDoubly<E> node = new NodeDoubly<E>(h.element);
            node.prev = h;
            node.next = h.next;
            h.next = node;
            h.next.prev = node;
            h.element = element;
        }
        size++;
        return;
    }
    public void addLast(E element){
        if(h.element == null){
            h.element = element;
        }else{
            NodeDoubly<E> node = new NodeDoubly<E>(element);
            node.prev = h.prev;
            node.next = h;
            h.prev = node;
            h.prev.prev.next = node;
        }
        size++;
        return;
    }
    public E first(){
        return h.element;
    }
    public E last(){
        return h.prev.element;
    }
    public E removeFirst(){
        rotateLeft();
        return removeLast();
    }
    public E removeLast(){
        E t = h.prev.element;
        h.prev.prev.next = h;
        h.prev = h.prev.prev;
        size--;
        return t;
    }
    public void rotateLeft(){
        h = h.next;
    }
    public void rotateRight(){
        h = h.prev;
    }
    public E getLeft(int n){
        return h.get(n);
    }
    public E getRight(int n){
        return h.revGet(n);
    }
}
