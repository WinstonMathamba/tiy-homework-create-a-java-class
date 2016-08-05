/**
 * Created by win808mac on 8/4/16.
 */
public class Main {
    public static void main(String [] args) {

        Puppy puppy1 = new Puppy("Poodle", "white", true, "sweet");
        puppy1.weight = 25;

        Puppy puppy2 = new Puppy("Chow Chow", "brown", false, "mean");
        puppy2.weight = 40;




        System.out.println(puppy1);
        System.out.println(puppy2);
        puppy2.likesWalk =true;
        System.out.println(puppy2);


    }


}
