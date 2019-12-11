package sorter;

import aircraft.Airplane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AirplaneSorter {
    public static void planesSort(List cmp, AirplaneGeneralSort... criterions) {
        for (int i = 0; i < criterions.length; i++) {
            Collections.sort(cmp, criterions[i]);
        }
    }
    public static void sortByOne(List cmp, AirplaneGeneralSort criterion) {
        Collections.sort(cmp, criterion);
    }

    public static Airplane planeMax(List cmp, AirplaneGeneralSort criterion) {
        List<Airplane> temp = new ArrayList<>();
        temp.addAll(cmp);
        Airplane max = null;
        max = Collections.max(temp, criterion);
        return max;
    }

    public static Airplane planeMin(List cmp, AirplaneGeneralSort criterion) {
        List<Airplane> temp = new ArrayList<>();
        temp.addAll(cmp);
        Airplane min = null;
        min = Collections.min(temp, criterion);
        return min;
    }
}