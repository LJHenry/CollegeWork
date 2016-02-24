package observerpattern02;

/**
 * -- Observer Pattern -- This program is an example of the observer pattern. It
 * sets up a subject to which observers are attached. When the state (a number)
 * is changed the observers are notified and updated and they print the new
 * number in their respective radix.
 *
 *
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 *
 */
public class ObserverPattern02 {

    public static void main(String[] args) {

        Test testing = new Test();
        Subject sub = new Subject();

        //Client configures the number and type of Observers
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);

        // Test the program by generating 100 random ints (range: 1-1000)
        for (int i = 0; i < 100; i++) {
            System.out.print("\nEnter a number: ");
            sub.setState(testing.random());
        }

    }

}
