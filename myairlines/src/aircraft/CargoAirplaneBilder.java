package aircraft;

public class CargoAirplaneBilder {

    private CargoAirplane cargoAirplane;

    public CargoAirplaneBilder() {
        cargoAirplane = new CargoAirplane();
    }


    public CargoAirplaneBilder setType(AirplaneProducer producer) {
        cargoAirplane.setProducer(producer);
        return this;
    }

    public CargoAirplaneBilder setCarriageType(String carriageType) {
        cargoAirplane.setCarriageType(carriageType);
        return this;
    }

    public CargoAirplaneBilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= cargoAirplane.getMaxCapacity())
            cargoAirplane.setCarriage(carriage);
        else System.err.println("This plane carriage can't exceed: " + cargoAirplane.getMaxCapacity());
        return this;
    }

    public CargoAirplaneBilder setMaxCapacity (int MaxCapacity){
        cargoAirplane.setMaxCapacity(MaxCapacity);
        return this;
    }

    public CargoAirplaneBilder setClient(String client) {
        cargoAirplane.setClient(client);
        return this;
    }

    public CargoAirplaneBilder setSender(String sender) {
        cargoAirplane.setSender(sender);
        return this;
    }

    public CargoAirplaneBilder setName(String name) {
        cargoAirplane.setName(name);
        return this;
    }

    public CargoAirplaneBilder setWeight(double weight) {
        if (weight > 0)
            cargoAirplane.setWeight(weight);
        return this;
    }

    public CargoAirplaneBilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            cargoAirplane.setFuelConsumption(fuelConsumption);
        return this;
    }

    public CargoAirplaneBilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            cargoAirplane.setFuelTank(fuelTank);
        return this;
    }

    public CargoAirplaneBilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            cargoAirplane.setFuelTank(fuelTank);
        return this;
    }

    public CargoAirplaneBilder setSpeed(int speed) {
        if (speed >= cargoAirplane.TAKE_OFF_SPEED)
            cargoAirplane.setMaxSpeed(speed);
        return this;
    }

    public CargoAirplane build() {
        return cargoAirplane;
    }
}

