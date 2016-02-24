package observerpattern02;

/**
 * An observer that prints the subject state in hexadecimal.
 *
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 *
 */
class HexObserver extends Observer {    //Concrete class of the "dependent" 

    //ctor
    public HexObserver(Subject s) {
        subj.attach(this);
    } //Observers register themselves

    /**
     * Print the subject state in respective radix
     */
    @Override
    public void update() {
        System.out.print("  " + Integer.toHexString(subj.getState()));
    }
}//Observers "pull" information 

