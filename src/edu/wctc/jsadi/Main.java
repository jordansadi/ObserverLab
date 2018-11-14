package edu.wctc.jsadi;

/**
 * This is the driver class for this package.
 * It creates one each of four different types of Observers, then tests two state changes.
 * Then it detaches one of the observers, then tests another state change.
 * Created by jsadi on 11/12/2018
 * @author Jordan Sadi
 * @version 2018 1112 1
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        new PositiveOrNegativeObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);

        System.out.println("Second state change: 10");
        subject.setState(10);

        subject.detach(3);

        System.out.println("Third state change: 100");
        subject.setState(100);
    }
}