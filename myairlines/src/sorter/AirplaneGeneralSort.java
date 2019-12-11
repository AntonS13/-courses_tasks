package sorter;

import aircraft.Airplane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AirplaneGeneralSort implements Comparator<Airplane> {

    List<Comparator<Airplane>> criterions;

    public AirplaneGeneralSort(Comparator<Airplane>... criterions) { // constructor
        this.criterions = Arrays.asList(criterions);
    }

    @Override
    public int compare(Airplane o1, Airplane o2) {
        if (o1 != null & o2 != null) {
            for (Comparator<Airplane> comparator : criterions) {
                int result = comparator.compare(o1, o2);
                if (result != 0) {
                    return result;
                }
            }
        } else System.err.println("Object <Plane> might been initialized!");
        return 0;
    }
}