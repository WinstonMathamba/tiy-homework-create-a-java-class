/**
 * Created by win808mac on 8/4/16.
 */
public class Puppy {
    String breed;
    String color;
    double weight;
    boolean likesWalk;


    // Wrote a class titled Puppy with five properties

    public Puppy(String breed, String color, boolean likesWalk) {
        this.breed = breed;
        this.color = color;
        this.likesWalk = likesWalk;

        //This is constructor for puppy with two arguments for breed and color
    }

    public String toString() {
        return "This " +
                this.color + this.breed + " weighs " + this.weight + "lbs!";
    }

}


