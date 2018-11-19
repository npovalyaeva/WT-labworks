package by.bsuir.povalyaeva.task9.util;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> balls = new ArrayList<Ball>();
    private int numberOfBalls;

    public void put(Ball ball) {
        this.balls.add(ball);
    }

    public void take(int indexOfBall) {
        this.balls.remove(indexOfBall);
    }
}
