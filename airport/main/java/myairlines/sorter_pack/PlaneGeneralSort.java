package myairlines.sorter_pack;

import myairlines.aircraft.Plane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PlaneGeneralSort implements Comparator<Plane> {

    List<Comparator<Plane>> criterions;

    // конструктор
    public PlaneGeneralSort(Comparator<Plane>... criterions) {
        this.criterions = Arrays.asList(criterions);
    }

    // сравнение самолетов
    @Override
    public int compare(Plane o1, Plane o2) {
        if (o1 != null & o2 != null) {
            for (Comparator<Plane> comparator : criterions) {
                int result = comparator.compare(o1, o2);
                if (result != 0) {
                    return result;
                }
            }
        } else System.err.println("Объект должен быть проинициализирован");
        return 0;
    }
}

