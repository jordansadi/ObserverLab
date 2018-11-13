package edu.wctc.jsadi;

/**
 * This abstract class defines an Observer.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}