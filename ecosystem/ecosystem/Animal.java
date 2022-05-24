abstract class Animal extends Spot {
    private Integer position;
    protected River river;

    public Animal(Integer position, River river){
        this.position = position;
        this.river = river;
    }
    public Integer getPosition() {
        return position;
    }
    public void setPosition(Integer position) {
        this.position = position;
    }

    public void move() {
        Integer futurePosition;
        Integer currentPosition = this.getPosition();
        if(rd.nextBoolean() && currentPosition > 0)
            futurePosition = this.getPosition() - 1;
        else if(currentPosition < (Ecosystem.RIVER_SIZE-1))
            futurePosition = this.getPosition() + 1;
        else
            futurePosition = currentPosition;
        if(river.checkCollision(futurePosition)){
            Animal target = this.river.getAnimalAt(futurePosition);
            this.interact(target);
        }else{
            this.position = futurePosition;
        }
    }

    public void die() {
        this.river.killAnimalAt(this.getPosition());
    }
}