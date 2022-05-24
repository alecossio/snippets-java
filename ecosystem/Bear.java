package ecosystem;

public class Bear extends Animal {
    public Bear(Integer position, River river){
        super(position, river);
    }
    
    public void interact(Animal neighbor) {
        if(neighbor instanceof Fish){
            neighbor.die();
        }else if(neighbor.gender != this.gender){
            super.river.addAnimal(new Bear(super.river.getRandomEmptyPlace(), super.river));
        }else{
            //rebound
        }
    }

    @Override
    public String toString() {
        return this.getGenderColor() + "B" + Display.ANSI_RESET;
    }
}
