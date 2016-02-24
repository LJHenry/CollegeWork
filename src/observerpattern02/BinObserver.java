package observerpattern02;

/**
 * An observer that prints the subject state in binary.
 *
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 *
 */
class BinObserver extends Observer {

    //ctor
    public BinObserver(Subject s) {
        subj = s;
        subj.attach(this);
    } //Observers register themselves

    /**
     * Print the subject state in respective radix
     */
    @Override
    public void update() {
        System.out.print("  " + Integer.toBinaryString(subj.getState()));
    }
}
