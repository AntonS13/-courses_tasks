package myairlines.utill_pack;

import myairlines.aircraft.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

    // конструктор
    private FileWrite() {
    }

    // запись в файл(пассажирский самолеты)
    public static Plane passengerPlaneInput(String path, PlaneProducer planeProducer) {

        PassengerPlaneBilder builder = new PassengerPlaneBilder();
        Plane plane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            plane = builder.setType(planeProducer)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setSeating(scn.nextInt())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return plane;
    }

    // запись в файл(грузовые самолеты)
    public static CargoPlane cargoPlaneInput(String path, PlaneProducer planeProducer) {

        CargoPlaneBilder builder = new CargoPlaneBilder();
        CargoPlane plane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            plane = builder.setType(planeProducer)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setCarriage(scn.nextInt())
                    .setCarriageType(scn.next())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return plane;
    }
}
