/**
 * Created by win808mac on 8/4/16.
 */
public class Main {
    public static void main(String [] args) {

        Puppy puppy1 = new Puppy("Poodle", "white ", true);
        puppy1.weight = 25;

        Puppy puppy2 = new Puppy("Chow Chow", "brown ", false);
        puppy2.weight = 40;



        System.out.println(puppy1);
        System.out.println(puppy2);

    }


}
