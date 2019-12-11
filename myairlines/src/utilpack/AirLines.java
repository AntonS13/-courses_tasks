package utilpack;

import aircraft.Airplane;

import java.util.ArrayList;
import java.util.List;

public class AirLines {

    protected String name;
    protected List<Airplane> airplanes;

    // конструкторы
    public AirLines() {
        List<Airplane> airplanes = new ArrayList<>();
    }

    public AirLines(String name, List<Airplane> airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    public AirLines(String name) {
        this.name = name;
    }

    public AirLines(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }


    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public long getAirLinesCapacity() {
        long result = 0;
        for (Airplane airplane : airplanes) {
            result += airplane.getMaxCapacity();
        }
        return result;
    }

    public long getAirLinesCarriage() {
        long result = 0;
        for (Airplane airplane : airplanes) {
            result += airplane.getCarriage();
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AirLines name: ");
        sb.append(name).append(". airplanes ").append(airplanes).append("\n");
        return sb.toString();
    }
}