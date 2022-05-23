import java.util.ArrayList;
import java.util.Random;

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
    private Integer position;

    public Animal(Integer position){
        this.position = position;
    }
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public void move() {
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

    public void die() {
        river.killAnimal(this.getPosition());
    }
}

class Bear extends Animal {
    public Bear(Integer position){
        super(position);
    }
    
    public void interact(Animal neighbor) {
        if(neighbor instanceof Fish){
            neighbor.die();
        }else if(neighbor.gender != this.gender){//refactor this later: this method should be hoisted into the upper class
            river.addAnimal(new Bear(river.getRandomEmptyPlace()));
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
    public Fish(Integer position){
        super(position);
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
                spot = new Bear(i);
                animals.add((Animal)spot);
            }
            else if(diceRoll < FISH_PROB){
                spot = new Fish(i);
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
            currentAnimal.move();
        }
    }

    
}

class Display {
    //IS THERE a better way to organize this?
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PINK = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_CLEAR = "\033[H\033[2J";
    public static final String ANSI_HOME = "\033[H";
    public static final String CUR_UP = "\033[A";
    public static final String CUR_DOWN = "\033[B";
    public static final String CUR_LEFT = "\033[D";
    public static final String CUR_RIGHT = "\033[C";
    public static final Integer SIZE_X = 50;
    public static final Integer SIZE_Y = 50;

    enum Dir {
        UP, DOWN, LEFT, RIGHT
    }

    River river;

    public void clear() {
        System.out.println(Display.ANSI_CLEAR);
    }

    public void goHome() {
        System.out.print(ANSI_HOME);
    }

    public void go(Dir dir){
        switch(dir){
            case UP:
                System.out.print(CUR_UP);
                break;
            case DOWN:
                System.out.print(CUR_DOWN);
                break;
            case LEFT:
                System.out.print(CUR_LEFT);
                break;
            case RIGHT:
                System.out.print(CUR_RIGHT);
                break;
        }
    }

    public void moveCursorNLines(Dir dir, Integer n){
        String code = "\033[[" + n;
        switch(dir){
            case UP:
                code += "A";
                break;
            case DOWN:
                code += "B";
                break;
            case LEFT:
                code += "D";
                break;
            case RIGHT:
                code += "E";
                break;
        }
        System.out.print(code);
    }

    public void drawFrame() {
        this.goHome();
        for(int i =0; i < SIZE_X; i++){
            System.out.print('=');
            //this.moveCursorNLines(Dir.DOWN, SIZE_Y);
            //System.out.print('=');
            //this.moveCursorNLines(Dir.UP, SIZE_Y);
            this.go(Dir.DOWN);
            this.go(Dir.LEFT);
            System.out.print('=');
            this.go(Dir.UP);
            this.go(Dir.LEFT);

        }
        
    }
}

public class Ecosystem {

    River river = new River(100);
    Display display = new Display();
    
    public static void main(String[] args) {
        Ecosystem system = new Ecosystem();    
        system.run();
    }

    public void run() {
        
        display.clear();
        display.drawFrame();
        //river.show();
        //every 1 second, river.update();
    }
}
