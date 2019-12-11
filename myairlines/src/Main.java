/*
Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию.
Посчитать общую вместимость и грузоподъемность.
Провести сортировку самолетов компании на основе одного и нескольких параметров.
Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
 */

import aircraft.Airplane;
import aircraft.AirplaneProducer;
import sorter.AirPlanesFilter;
import sorter.AirplaneGeneralSort;
import sorter.AirplaneSorter;
import utilpack.AirLines;
import utilpack.FileRead;
import utilpack.FileWrite;

import java.util.ArrayList;
import java.util.List;

import static sorter.AirplaneSortCriterions.*;

public class Main {
    public static void main(String[] args) {

        Airplane airplane1 = FileWrite.passengerAirplaneInput("/Users/antonsalva/IdeaProjects/myairlines/src/file/File_Boeing 747-100.txt", AirplaneProducer.BOEING);
        Airplane airplane2 = FileWrite.passengerAirplaneInput("/Users/antonsalva/IdeaProjects/myairlines/src/file/File_AIRBUS A300.txt", AirplaneProducer.AIRBUS);
        Airplane airplane3 = FileWrite.passengerAirplaneInput("/Users/antonsalva/IdeaProjects/myairlines/src/file/File_AIRBUS A300-1.txt", AirplaneProducer.AIRBUS);
        Airplane airplane4 = FileWrite.passengerAirplaneInput("/Users/antonsalva/IdeaProjects/myairlines/src/file/File_AIRBUS A300-2.txt", AirplaneProducer.AIRBUS);

        List<Airplane> airplanes = new ArrayList<>();
        airplanes.add(airplane1);
        airplanes.add(airplane2);
        airplanes.add(airplane3);
        airplanes.add(airplane4);

        AirplaneSorter.planesSort(airplanes, new AirplaneGeneralSort(BY_NAME, BY_FLIGHT_RANGE));
        AirplaneSorter.planeMax(airplanes, new AirplaneGeneralSort(BY_CAPACITY));
        AirplaneSorter.planeMin(airplanes, new AirplaneGeneralSort(BY_FUEL_COMSUMPTION));

        AirLines airLines = new AirLines("Minsk Airlines", airplanes);
        AirLines filteredByFuel = new AirLines("FilteredByFuel", AirPlanesFilter.filterFuelConsumption(airplanes, 6000, 8000));
        AirLines filteredByName = new AirLines("FilteredByName", AirPlanesFilter.filterByName(airplanes, "747"));

        FileRead.output(airLines,"/Users/antonsalva/IdeaProjects/myairlines/src/file/File_airlines.txt");
        for (Airplane airplane:airplanes) {
            System.out.println(airplane);
        }


    }
}
