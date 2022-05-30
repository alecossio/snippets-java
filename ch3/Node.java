public class Node<E>{
    protected E element;
    protected Node<E> next;    

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
