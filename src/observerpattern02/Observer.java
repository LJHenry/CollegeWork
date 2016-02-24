package observerpattern02;

/**
 * Abstract base class for Observers.
 * 
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 * 
 */
abstract class Observer {               //Root of the "dependent" hierarchy
    protected Subject subj;
    public abstract void update();
}
