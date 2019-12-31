package myairlines.aircraft;

public class CargoPlaneBilder {

    private CargoPlane cargoAirliner;

    // конструктор
    public CargoPlaneBilder() {
        cargoAirliner = new CargoPlane();
    }


    public CargoPlaneBilder setType(PlaneProducer producer) {
        cargoAirliner.setProducer(producer);
        return this;
    }

    public CargoPlaneBilder setCarriageType(String carriageType) {
        cargoAirliner.setCarriageType(carriageType);
        return this;
    }

    public CargoPlaneBilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= cargoAirliner.getMaxCapacity())
            cargoAirliner.setCarriage(carriage);
        else System.err.println("Этот самолет не может превышать: " + cargoAirliner.getMaxCapacity());
        return this;
    }

    public CargoPlaneBilder setMaxCapacity (int MaxCapacity){
        cargoAirliner.setMaxCapacity(MaxCapacity);
        return this;
    }

    public CargoPlaneBilder setName(String name) {
        cargoAirliner.setName(name);
        return this;
    }

    public CargoPlaneBilder setWeight(double weight) {
        if (weight > 0)
            cargoAirliner.setWeight(weight);
        return this;
    }

    public CargoPlaneBilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            cargoAirliner.setFuelConsumption(fuelConsumption);
        return this;
    }

    public CargoPlaneBilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            cargoAirliner.setFuelTank(fuelTank);
        return this;
    }

    public CargoPlaneBilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            cargoAirliner.setFuelTank(fuelTank);
        return this;
    }

    public CargoPlaneBilder setSpeed(int speed) {
        if (speed >= cargoAirliner.TAKE_OFF_SPEED)
            cargoAirliner.setMaxSpeed(speed);
        return this;
    }

    public CargoPlane build() {
        return cargoAirliner;
    }
}