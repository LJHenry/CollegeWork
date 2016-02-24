package observerpattern02;

import java.util.Random;

/**
 * This class is for testing the program. It will generate either an increasing
 * number from 0 or random numbers.
 *
 *
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 *
 */
public class Test {

    int number;

    //ctor
    public Test() {
        number = 0;
    }

    //Return increasing number
    public int increment() {
        number++;
        System.out.println(number);
        return number;
    }

    //Return random numhber
    public int random() {
        Random rand = new Random();
        number = rand.nextInt(1000);
        System.out.println(number);
        return number;
    }

}
