package myairlines;

import myairlines.aircraft.Plane;
import myairlines.aircraft.PlaneProducer;
import myairlines.sorter_pack.PlaneFilter;
import myairlines.sorter_pack.PlaneGeneralSort;
import myairlines.sorter_pack.PlaneSorter;
import myairlines.utill_pack.Airlines;
import myairlines.utill_pack.FileRead;
import myairlines.utill_pack.FileWrite;

import java.util.ArrayList;
import java.util.List;

import static myairlines.sorter_pack.PlaneSortCriterions.*;
import static myairlines.sorter_pack.PlaneSortCriterions.BY_FUEL_COMSUMPTION;

public class Main {
    public static void main(String[] args) {

        // чтение с файлов
        Plane plane_0 = FileWrite.passengerPlaneInput("/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_Boeing 747-100.txt",
                PlaneProducer.BOEING.BOEING);
        Plane plane_1 = FileWrite.passengerPlaneInput("/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_AIRBUS A300.txt",
                PlaneProducer.AIRBUS.AIRBUS);
        Plane plane_2 = FileWrite.passengerPlaneInput("/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_AIRBUS A300-L.txt",
                PlaneProducer.AIRBUS);
        Plane plane_3 = FileWrite.cargoPlaneInput("/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_AN_Ruslan_AN124.txt",
                PlaneProducer.AH);
        Plane plane_4 = FileWrite.cargoPlaneInput("/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_AN_Mriya_AN225.txt",
                PlaneProducer.AH);

        List<Plane> planes = new ArrayList<Plane>();
        planes.add(plane_0);
        planes.add(plane_1);
        planes.add(plane_2);
        planes.add(plane_3);
        planes.add(plane_4);

        // сортировка
        PlaneSorter.planesSort(planes, new PlaneGeneralSort(BY_NAME, BY_FLIGHT_RANGE));
        PlaneSorter.planeMax(planes, new PlaneGeneralSort(BY_CAPACITY));
        PlaneSorter.planeMin(planes, new PlaneGeneralSort(BY_FUEL_COMSUMPTION));

        Airlines airlines = new Airlines("Minsk airlines", planes);
        for (Plane pl:planes) {
            System.out.println(pl);
        }

        // запись в файл
        FileRead.output(airlines,"/Users/antonsalva/IdeaProjects/minskairlines/src/main/java/myairlines/files/File_out.txt");
    }
}
