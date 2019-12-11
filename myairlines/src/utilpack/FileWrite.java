package utilpack;

import aircraft.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

    private FileWrite() {

    }

    public static PassengerAirplane passengerAirplaneInput(String path, AirplaneProducer producer) {

        PassengerAirplaneBilder builder = new PassengerAirplaneBilder();
        PassengerAirplane passengerAirplane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            passengerAirplane = builder.setType(producer)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setDeparture(scn.next())
                    .setDestination(scn.next())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setSeating(scn.nextInt())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return passengerAirplane;
    }


    public static CargoAirplane cargoAirlinerInput(String path, AirplaneProducer producer) {

        CargoAirplaneBilder builder = new CargoAirplaneBilder();
        CargoAirplane cargoAirplane = null;
        try (Scanner scn = new Scanner(new FileInputStream(path))) {
            cargoAirplane = builder.setType(producer)
                    .setName(scn.next())
                    .setFuelConsumption(scn.nextInt())
                    .setFuelTankMax(scn.nextInt())
                    .setFuelTank(scn.nextInt())
                    .setMaxCapacity(scn.nextInt())
                    .setSender(scn.next())
                    .setClient(scn.next())
                    .setSpeed(scn.nextInt())
                    .setWeight(scn.nextDouble())
                    .setCarriage(scn.nextInt())
                    .setCarriageType(scn.next())
                    .build();
        } catch (IOException e) {
            System.out.println(e);
        }
        return cargoAirplane;
    }
}