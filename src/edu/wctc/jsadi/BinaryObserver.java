package edu.wctc.jsadi;

/**
 * This class extends Observer and defines a BinaryObserver.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class BinaryObserver extends Observer {
    /**
     * This constructor defines a BinaryObserver
     * Each BinaryObserver is initialized with a specified Subject and added to the List of Observers
     * @param subject Subject the specified Subject to be added to the List of Observers
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * This method converts the state of a Subject to binary and prints the result
     */
    @Override
    public void update() {
        System.out.println( "Binary String: " +
                Integer.toBinaryString( subject.getState()));
    }
}