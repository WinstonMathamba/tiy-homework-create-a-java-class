/**
 * Created by win808mac on 8/4/16.
 */
public class Puppy {
    String breed;
    String color;
    String temperment;
    double weight;
    boolean likesWalk;


    // Wrote a class titled Puppy with four properties

    public Puppy(String breed, String color, boolean likesWalk, String temperment) {
        this.breed = breed;
        this.color = color;
        this.likesWalk = likesWalk;
        this.temperment = temperment;

    }
        //This is constructor for puppy with two arguments for breed and color


    public String toString() {
        String response =  "This " + this.temperment + " " + this.color + " " + this.breed + " weighs "
                + this.weight + "lbs";

        if(likesWalk) {
            response = response + ", and also likes going for long walks";
        } else {
            response = response + ", and hates to go for walks :(";

        }
        return response;

    }

}




