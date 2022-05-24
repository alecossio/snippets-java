
import java.util.ArrayList;
import java.util.Random;

class River {
    private ArrayList<Spot> places = new ArrayList<>();
    private Random rd = new Random();
    private ArrayList<Animal> animals = new ArrayList<>();

    public River(Integer size){
        Spot spot;
        for(int i=0; i<size; i++){
            Integer diceRoll = rd.nextInt(101);
            if(diceRoll < Ecosystem.BEAR_PROB){
                spot = new Bear(i, this);
                animals.add((Animal)spot);
            }
            else if(diceRoll < Ecosystem.FISH_PROB){
                spot = new Fish(i, this);
                animals.add((Animal)spot);
            }
            else
                spot = new Empty();
            this.places.add(spot);
        }
    }

    public boolean checkCollision(Integer futurePosition) {
        if(places.get(futurePosition) instanceof Empty)
            return false;
        else
            return true;
    }

    public Integer getRandomEmptyPlace() {
        Integer newPlace;
        do{
            newPlace = rd.nextInt(Ecosystem.RIVER_SIZE-1);
            System.out.println("new place = " + newPlace);
        }while(!(places.get(newPlace) instanceof Empty));
        return newPlace;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        this.places.add(animal);
    }

    public Animal getAnimalAt(Integer futurePosition) {
        return (Animal)places.get(futurePosition);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void killAnimalAt(Integer position) {
        Animal animal = (Animal)this.places.get(position);
        this.animals.remove(animal);
        this.places.set(position, new Empty());
    }

    public ArrayList<Spot> getPlaces() {
        return places;
    }

    public void setPlaces() {
        for(Animal animal : animals) {
            places.set(animal.getPosition(), animal);
        }
    }
   
}
