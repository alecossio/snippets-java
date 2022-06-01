import java.util.zip.DeflaterOutputStream;

import javax.swing.event.SwingPropertyChangeSupport;

class Dep {
    private int field;
    protected String element;

    public Dep(String newElement){
        this.element = newElement;
        System.out.println("Dep constructor called");
    }
    public int getField() {
        return field;
    }
    public void setField(int field) {
        this.field = field;
    }
    public void printField(){
        System.out.println(this.field);
    }
}

class DepDep extends Dep{
    protected int fieldField;
    protected long field;

    public DepDep(String newElement){
        super(newElement);
    }
}
public class Inherit {
    
    public static void main(String[] args) {
        DepDep depDep = new DepDep("caca");
        depDep.field = 1;
        depDep.printField();
        System.out.println(depDep.element);

    }
}
