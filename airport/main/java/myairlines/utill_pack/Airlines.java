package myairlines.utill_pack;

import myairlines.aircraft.Plane;

import java.util.ArrayList;
import java.util.List;

public class Airlines {

    protected String name;
    protected List<Plane> airplanes;

    // конструкторы
    public Airlines() {
        List<Plane> airplanes = new ArrayList<>();
    }

    public Airlines(String name, List<Plane> airplanes) {
        this.name = name;
        this.airplanes = airplanes;
    }

    public Airlines(String name) {
        this.name = name;
    }

    public Airlines(List<Plane> airplanes) {
        this.airplanes = airplanes;
    }

    // геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Plane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Plane> airplanes) {
        this.airplanes = airplanes;
    }

    public long getAirLinesCapacity() {
        long result = 0;
        for (Plane plane : airplanes) {
            result += plane.getCarriage();
        }
        return result;
    }

    public long getAirLinesCarriage() {
        long result = 0;
        for (Plane plane : airplanes) {
            result += plane.getMaxCapacity();
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Авиалинии ");
        sb.append(name).append(" в наличии следующие самолеты: \n").append(airplanes).append("\n");
        return sb.toString();
    }
}