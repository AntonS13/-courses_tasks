package aircraft;

public class PassengerAirplaneBilder {
    private PassengerAirplane passengerAirplane;

    public PassengerAirplaneBilder() {
        passengerAirplane = new PassengerAirplane();
    }

    public PassengerAirplaneBilder setType(AirplaneProducer producer) {
        passengerAirplane.setProducer(producer);
        return this;
    }

    public PassengerAirplaneBilder setName(String name) {
        passengerAirplane.setName(name);
        return this;
    }

    public PassengerAirplaneBilder setSeating(int seating) {
        if (seating > 0)
            passengerAirplane.setSeating(seating);
        return this;
    }

    public PassengerAirplaneBilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= passengerAirplane.getMaxCapacity())
            passengerAirplane.setCarriage(carriage);
        else System.err.println("This plane carriage can't exceed: " + passengerAirplane.getMaxCapacity());
        return this;
    }

    public PassengerAirplaneBilder setDeparture(String departure) {
        passengerAirplane.setDeparture(departure);
        return this;
    }

    public PassengerAirplaneBilder setDestination(String destination) {
        passengerAirplane.setDestination(destination);
        return this;
    }

    public PassengerAirplaneBilder setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0)
            passengerAirplane.setMaxCapacity(maxCapacity);
        return this;
    }

    public PassengerAirplaneBilder setWeight(double weight) {
        if (weight > 0)
            passengerAirplane.setWeight(weight);
        return this;
    }

    public PassengerAirplaneBilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            passengerAirplane.setFuelConsumption(fuelConsumption);
        return this;
    }

    public PassengerAirplaneBilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            passengerAirplane.setFuelTank(fuelTank);
        return this;
    }

    public PassengerAirplaneBilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            passengerAirplane.setFuelTankMax(fuelTank);
        return this;
    }

    public PassengerAirplaneBilder setSpeed(int speed) {
        if (speed >= passengerAirplane.TAKE_OFF_SPEED)
            passengerAirplane.setMaxSpeed(speed);
        return this;
    }

    public PassengerAirplane build() {
        return passengerAirplane;
    }
}
