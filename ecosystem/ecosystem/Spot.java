
import java.util.Random;

public abstract class Spot {

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
