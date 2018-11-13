package edu.wctc.jsadi;

/**
 * This class extends Observer and defines an OctalObserver.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class OctalObserver extends Observer {
    /**
     * This constructor defines an OctalObserver
     * Each OctalObserver is initialized with a specified Subject and added to the List of Observers
     * @param subject Subject the specified Subject to be added to the List of Observers
     */
    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * This method converts the state of a Subject to base 8 and prints the result
     */
    @Override
    public void update() {
        System.out.println("Octal String: " +
                Integer.toOctalString(subject.getState() ) );
    }
}