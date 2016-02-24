package observerpattern02;

import java.util.ArrayList;

/**
 * This is the subject class. The subject holds observers in an ArrayList and
 * has its own state which when modified will notify attached observers.
 *
 * @author Louis Henry
 * @version 1.0
 * @since 23/02/16
 *
 */
public class Subject {//The "independent" abs

    private ArrayList<Observer> observers = new ArrayList<>();  //Coupled to base class
    private int totalObs = 0;
    private int state;

    /**
     * Adds the passed observer to this.ArrayList
     *
     * @param o This is the observer which calls the method
     */
    public void attach(Observer o) {
        observers.add(totalObs++, o);
    } //Coupled

    /**
     * Access this.state
     *
     * @return The number held by this
     */
    public int getState() {
        return state;
    }

    /**
     * Mutate this.state
     *
     * @param in New number to change state
     */
    public void setState(int in) {
        state = in;
        notifyObservers();
    }

    /**
     * Tells observers that the state has changed
     */
    private void notifyObservers() {
        for (Observer i : observers) {
            i.update();     //Coupled to base class
        }
    }//Broadcast events to observers

}
