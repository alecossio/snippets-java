public class NodeDoubly<E> extends Node<E>{
    protected NodeDoubly<E> prev;
    protected NodeDoubly<E> next;
    
    public NodeDoubly(E element){
        super(element);
    }
    public E revGet(int n){
        if(n == 0){
            return element;
        }
        else
            return prev.revGet(n-1);
    }
    public E get(int n){
        if(n == 0)
            return element;
        else
            return next.get(n-1);
    }
}
