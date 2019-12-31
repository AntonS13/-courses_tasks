package myairlines.utill_pack;

import myairlines.aircraft.Plane;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AirlinesTest {

    @Test
    public void getName() {
        Airlines airlines = new Airlines("A");
        assertEquals("A", airlines.getName());
    }

    @Test
    public void setName() {
        Airlines airlines = new Airlines("A");
        airlines.setName("A");
        assertEquals("A", airlines.getName());
    }

    @Test
    public void getAirplanes() {
        List<Plane> airplanes = new ArrayList<>();
        airplanes.add(new Plane());
        List<Plane> airplanes2 = new ArrayList<>();
        airplanes2.add(new Plane());
        assertEquals(airplanes);
    }

    @Test
    public void setAirplanes() {
    }

    @Test
    public void getAirLinesCapacity() {
        Airlines airlines = new Airlines();
        List<Plane> airplanes = new ArrayList<>();
        airplanes.add(new Plane());
        airplanes.add(new Plane());
        airplanes.get(0).setCarriage(10);
        airplanes.get(1).setCarriage(10);
        assertEquals(20, airlines.getAirLinesCapacity());
    }

    @Test
    public void getAirLinesCarriage() {
        Airlines airlines = new Airlines();
        List<Plane> airplanes = new ArrayList<>();
        airplanes.add(new Plane());
        airplanes.add(new Plane());
        airplanes.get(0).setMaxCapacity(10);
        airplanes.get(1).setMaxCapacity(10);
        assertEquals(20, airlines.getAirLinesCapacity());
    }
}