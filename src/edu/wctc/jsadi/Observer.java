package edu.wctc.jsadi;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}