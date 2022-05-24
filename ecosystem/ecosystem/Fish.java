
public class Fish extends Animal {
    public Fish(Integer position, River river){
        super(position, river);
    }

    public void interact(Animal neighbor) {
        if(neighbor instanceof Fish && neighbor.gender != this.gender){
            //procreate
        }else{
            //rebound
        }
    }

    @Override
    public String toString() {
        return /*this.getGenderColor() +*/ "f" + Display.ANSI_RESET;
    }
}
