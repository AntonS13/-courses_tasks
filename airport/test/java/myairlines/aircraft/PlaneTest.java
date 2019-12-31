package myairlines.aircraft;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneTest {

    @Test
    public void getFlightRange() {
        Plane plane = new Plane();
        plane.setFuelTank(100);
        plane.getFuelConsumption(10.0);
        assertEquals(10, plane.getFlightRange());
    }

    @Test
    public void isReadyForFly() {
        Plane plane = new Plane();
        assertEquals(false, plane.isReadyForFly());
    }
}