package myairlines.aircraft;

import org.junit.Test;

import static org.junit.Assert.*;

public class CargoPlaneTest {

    @Test
    public void getCarriageType() {
        CargoPlane cargoPlane = new CargoPlane();
        cargoPlane.setCarriageType("stuff");
        assertEquals("stuff", cargoPlane.getCarriageType());
    }

    @Test
    public void setCarriageType() {
        CargoPlane cargoPlane = new CargoPlane();
        cargoPlane.setCarriageType("stuff");
        assertEquals("stuff", cargoPlane.getCarriageType());
    }
}