package myairlines.sorter_pack;

import myairlines.aircraft.Plane;

import java.util.ArrayList;
import java.util.List;

public class PlaneFilter {

    // фильт по скорости
    public static List<Plane> filterSpeed(List planes, int limitFrom, int limitBefore) {
        List<Plane> temp = new ArrayList<>();
        List<Plane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if(plane.getMaxSpeed() > limitFrom && plane.getMaxSpeed() < limitBefore)
                result.add(plane);
        }
        return result;
    }

    // фильтр по имени
    public static List<Plane> filterByName(List planes, String toFind) {
        List<Plane> temp = new ArrayList<>();
        List<Plane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if (plane.getName().contains(toFind))
                result.add(plane);
        }
        return result;
    }

    // фильт потребление топлива
    public static List<Plane> filterFuelConsumption(List planes, double limitFrom, double limitBefore) {
        List<Plane> temp = new ArrayList<>();
        List<Plane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Plane plane : temp) {
            if (plane.getFuelConsumption(10.0) >= limitFrom && plane.getFuelConsumption(10.0) <= limitBefore)
                result.add(plane);
        }
        return result;
    }
}
