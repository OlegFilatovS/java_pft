package ru.stqa.pft.sandbox;

/**
 * Created by oleg.filatov on 21.07.2016.
 */
public class Point {

    private double x;
    private double y;

    public Point (double x, double y) {

        this.x = x;
        this.y = y;

    }

    public void setX (double x ) {

        this.x = x;
    }


    public double getX () {
        return x;
    }


    public void setY (double y){
        this.y = y;
    }

    public  double getY () {
        return  y;
    }

    public double distance(Point secondPoint) {

        x = this.getX();
        y = this.getY();

        double distanceBetweenFirstAndSecond;

        distanceBetweenFirstAndSecond = Math.sqrt((Math.pow((secondPoint.getX() - x), 2)) + (Math.pow((secondPoint.getY() - y), 2)));

        return distanceBetweenFirstAndSecond;
    }

    public double distance(Point firstPoint, Point secondPoint) {

        double distanceBetweenFirstAndSecond;

        distanceBetweenFirstAndSecond = Math.sqrt((Math.pow((secondPoint.getX() - firstPoint.getX()), 2)) + (Math.pow((secondPoint.getY() - firstPoint.getY()), 2)));

        return distanceBetweenFirstAndSecond;
    }

}
