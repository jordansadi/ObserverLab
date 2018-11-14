package edu.wctc.jsadi;

import java.util.ArrayList;
import java.util.List;

/**
 * This class defines a Subject.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    /**
     * This method returns an integer that represents the state of the Subject
     * @return int the state of the Subject
     */
    public int getState() {
        return state;
    }

    /**
     * This method sets the state of the Subject to a specified value
     * @param state the intended new state for the Subject
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * This method adds a specified Observer to the List of Observers
     * @param observer the specified Observer to be attached
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * This method removes the Observer at a specified index of the List from the List
     * @param i the specified index of the List from which to remove an Observer
     */
    public void detach(int i) {
        observers.remove(observers.get(i));
    }

    /**
     * This method runs through the list of Observers and calls the update() method for each one
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}