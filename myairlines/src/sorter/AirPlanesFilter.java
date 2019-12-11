package sorter;

import aircraft.Airplane;

import java.util.ArrayList;
import java.util.List;

public abstract class AirPlanesFilter {

    public static List<Airplane> filterSpeed(List planes, int limitFrom, int limitBefore) {
        List<Airplane> temp = new ArrayList<>();
        List<Airplane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Airplane plane : temp) {
            if(plane.getMaxSpeed() > limitFrom && plane.getMaxSpeed() < limitBefore)
                result.add(plane);
        }
        return result;
    }

    public static List<Airplane> filterByName(List planes, String toFind) {
        List<Airplane> temp = new ArrayList<>();
        List<Airplane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Airplane plane : temp) {
            if (plane.getName().contains(toFind))
                result.add(plane);
        }
        return result;
    }

    public static List<Airplane> filterFuelConsumption(List planes, double limitFrom, double limitBefore) {
        List<Airplane> temp = new ArrayList<>();
        List<Airplane> result = new ArrayList<>();
        temp.addAll(planes);
        for (Airplane plane : temp) {
            if (plane.getFuelConsumption() >= limitFrom && plane.getFuelConsumption() <= limitBefore)
                result.add(plane);
        }
        return result;
    }
}