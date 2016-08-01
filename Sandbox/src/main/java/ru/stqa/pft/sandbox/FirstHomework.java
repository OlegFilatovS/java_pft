package ru.stqa.pft.sandbox;

/**
 * Created by oleg.filatov on 21.07.2016.
 */
public class FirstHomework {


    public static void main(String[] args) {


        Point p1 = new Point(3,2);
        Point p2 = new Point(4,2);

        //Execution with static method

        System.out.printf("The distance beetween first poin and second is %.2f" , distance(p1, p2));

        //Execution with Point Class method with 2 variables
        System.out.printf("\n The distance beetween first poin and second is %.2f" , p1.distance(p1,p2));

        //Execution with overloaded Point Class method with 1 variable

        System.out.printf("\n The distance beetween first poin and second is %.2f" , p1.distance(p2));



    }

    public static double distance(Point firstPoint, Point secondPoint){

        double distanceBetweenFirstAndSecond;

        distanceBetweenFirstAndSecond = Math.sqrt((Math.pow((secondPoint.getX()-firstPoint.getX()),2))+(Math.pow((secondPoint.getY()-firstPoint.getY()),2)));

        return distanceBetweenFirstAndSecond;

    }

}
