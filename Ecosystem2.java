import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

enum Gender {
    Girl,
    Boy
}

abstract class Spot {

    Gender gender;
    Random rd = new Random();
    River river;

    public abstract void interact(Animal neighbor);
    
    public Spot() {
        if(rd.nextBoolean())
            this.gender = Gender.Girl;
        else
            this.gender = Gender.Boy;
    }
    
    public String getGenderColor() {
        if(this.gender == Gender.Girl)
            return Display.ANSI_PINK;
        else
            return Display.ANSI_CYAN;
    }

}

abstract class Animal extends Spot {
    protected River river;
    
    private Integer position;

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

    public void move(River river) {
        Integer futurePosition;
        if(rd.nextBoolean())
            futurePosition = this.getPosition() + 1;
        else
            futurePosition = this.getPosition() - 1;
        if(river.checkCollision(futurePosition)){
            Animal target = river.getAnimalAt(futurePosition);
            this.interact(target);
        }else{
            this.position = futurePosition;
        }
    }
}

class Bear extends Animal {
    public Bear(Integer position, River river){
        super(position, river);
    }
    
    public void interact(Animal neighbor) {
        if(neighbor instanceof Fish){
            this.river.killAnimal(neighbor.getPosition());
        }else if(neighbor.gender != this.gender){//refactor this later: this method should be hoisted into the upper class
            river.addAnimal(new Bear(river.getRandomEmptyPlace(), this.river));
        }else{
            //rebound
        }
    }

    @Override
    public String toString() {
        return this.getGenderColor() + "B" + Display.ANSI_RESET;
    }
}

class Fish extends Animal {
    public Fish(Integer position, River river){
        super(position, river);
    }

    public void interact(Animal neighbor) {
        if(neighbor instanceof Fish && neighbor.gender != this.gender){
            river.addAnimal(new Fish(river.getRandomEmptyPlace(), this.river));
        }else{
            //rebound
        }
    }

    @Override
    public String toString() {
        return this.getGenderColor() + "f" + Display.ANSI_RESET;
    }
}

class Empty extends Spot {
    public void interact(Animal neighbor){
        //do nothing?
    }
    
    @Override
    public String toString() {
        return ".";
    }
}

class River {
    public static final Integer BEAR_PROB = 10;
    public static final Integer FISH_PROB = 23;
    
    private ArrayList<Spot> places = new ArrayList<>();
    private Random rd = new Random();
    private ArrayList<Animal> animals = new ArrayList<>();

    public River(Integer size){
        Spot spot;
        for(int i=0; i<size; i++){
            Integer diceRoll = rd.nextInt(101);
            if(diceRoll < BEAR_PROB){
                spot = new Bear(i, this);
                animals.add((Animal)spot);
            }
            else if(diceRoll < FISH_PROB){
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
        do
            newPlace = rd.nextInt();
        while(!(places.get(newPlace) instanceof Empty));
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

    public void killAnimal(Integer position) {
        Animal animal = (Animal)this.places.get(position);
        this.animals.remove(animal);
        this.places.set(position, new Empty());
    }

    public void show() {
        System.out.print("[");
        for(Spot place : places){
            System.out.print(place);
        }
        System.out.println("]");
    }

    public void update() {
        //for each animal in animals, move()
        //if collides with neighbor, interact
        //else take new place
        for(Animal currentAnimal : animals){
            currentAnimal.move(this);
        }
    }
}

public class Ecosystem2 {

    River river = new River(100);

    public static void main(String[] args) {
        Ecosystem2 system = new Ecosystem2();    
        system.run();
    }

    public void run() {
        
        while(true){
            river.update();
            river.show();
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
