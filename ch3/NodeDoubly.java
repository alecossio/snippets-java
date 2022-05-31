public class NodeDoubly<E> extends Node<E>{
    protected NodeDoubly<E> prev;
    protected NodeDoubly<E> next;
    
    public NodeDoubly(E element){
        super(element);
    }
    public E revGet(int n){
        System.out.println("revgetting");
        if(n == 0){
            System.out.println("found");
            return element;
        }
        else
            return prev.revGet(n-1);
        } 
}
