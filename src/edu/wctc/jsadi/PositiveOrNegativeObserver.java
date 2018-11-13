package edu.wctc.jsadi;

/**
 * This class extends Observer and defines a PositiveOrNegativeObserver.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class PositiveOrNegativeObserver extends Observer {

    /**
     * This constructor defines a PositiveOrNegativeObserver
     * Each PositiveOrNegativeObserver is initialized with a specified Subject and added to the List of Observers
     * @param subject Subject the specified Subject to be added to the List of Observers
     */
    public PositiveOrNegativeObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * This method prints whether the state of a Subject is positive, negative, or zero
     */
    @Override
    public void update() {
        String subjectVal;

        if (subject.getState() < 0)
            subjectVal = "Negative";
        else if (subject.getState() > 0)
            subjectVal = "Positive";
        else
            subjectVal = "Zero";

        System.out.println( "Positive, Negative, or Zero: " + subjectVal);
    }
}
