/**
 * Created by win808mac on 8/4/16.
 */
public class Puppy{
    String breed;
    String color;
    double weight;
    boolean likesWalk;
    boolean isHyper;

    // Wrote a class titled Puppy with five properties

    public Puppy(String breed, String color) {
        this.breed = breed;
        this.color = color;

        //This is constructor for puppy with two arguments for breed and color
    }

    public String isLazy(boolean isHyper){
        if (this.isHyper) {

            return "is a hyper dog!";

        } else {

            return "is a lazy puppy"; }


        }

    public String likesWalk(boolean likesWalk) {
        if (this.likesWalk) {
                return " and enjoys long walks."; }
            else {
                return " and hates to take long walks."; }


            }
    }
    public String toString(){
        return "This " this.color + this.breed + " weighs" + this.weight + "lbs" + this.isLazy() + " and" + this.likesWalk

    }
}
