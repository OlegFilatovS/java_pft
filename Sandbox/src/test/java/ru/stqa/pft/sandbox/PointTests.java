package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Oleg.Filatov on 01.08.2016.
 */
public class PointTests {

    @Test
    public void testArea() {
        Point p1 = new Point(3,2);
        Point p2 = new Point(4,2);
        Point p3 = new Point(6,3);
        Point p4 = new Point(4,2);

        Assert.assertEquals(p1.distance(p2),1.00); //positive

        Assert.assertEquals(p3.distance(p4),1.00); //negative

    }


}
