package myairlines.aircraft;

public class PassengerPlaneBilder {
    private PassengerPlane passengerPlane;

    // конструктор
    public PassengerPlaneBilder() {
        passengerPlane = new PassengerPlane();
    }

    public PassengerPlaneBilder setType(PlaneProducer producer) {
        passengerPlane.setProducer(producer);
        return this;
    }

    public PassengerPlaneBilder setName(String name) {
        passengerPlane.setName(name);
        return this;
    }

    public PassengerPlaneBilder setSeating(int seating) {
        if (seating > 0)
            passengerPlane.setSeatOnAirplane(seating);
        return this;
    }

    public PassengerPlaneBilder setCarriage(int carriage) {
        if (carriage > 0 && carriage <= passengerPlane.getMaxCapacity())
            passengerPlane.setCarriage(carriage);
        else System.err.println("Этот самолет не может превышать: " + passengerPlane.getMaxCapacity());
        return this;
    }

    public PassengerPlaneBilder setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0)
            passengerPlane.setMaxCapacity(maxCapacity);
        return this;
    }

    public PassengerPlaneBilder setWeight(double weight) {
        if (weight > 0)
            passengerPlane.setWeight(weight);
        return this;
    }

    public PassengerPlaneBilder setFuelConsumption(int fuelConsumption) {
        if (fuelConsumption > 0)
            passengerPlane.setFuelConsumption(fuelConsumption);
        return this;
    }

    public PassengerPlaneBilder setFuelTank(int fuelTank) {
        if (fuelTank > 0)
            passengerPlane.setFuelTank(fuelTank);
        return this;
    }

    public PassengerPlaneBilder setFuelTankMax(int fuelTank) {
        if (fuelTank > 0)
            passengerPlane.setFuelTankMax(fuelTank);
        return this;
    }

    public PassengerPlaneBilder setSpeed(int speed) {
        if (speed >= passengerPlane.TAKE_OFF_SPEED)
            passengerPlane.setMaxSpeed(speed);
        return this;
    }

    public PassengerPlane build() {
        return passengerPlane;
    }
}
