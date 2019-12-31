package myairlines.aircraft;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerPlaneTest {

    @Test
    public void getSeatOnAirplane() {
        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.setSeatOnAirplane(10);
        int a = passengerPlane.getSeatOnAirplane();
        assertEquals(10, a);
    }

    @Test
    public void setSeatOnAirplane() {
        PassengerPlane passengerPlane = new PassengerPlane();
        passengerPlane.setSeatOnAirplane(10);
        int a = passengerPlane.getSeatOnAirplane();
        assertEquals(10, a);
    }
}