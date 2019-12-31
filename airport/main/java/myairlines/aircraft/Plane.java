package myairlines.aircraft;

public class Plane extends Aircraft {

    private final PlaneProducer PRODUCER = PlaneProducer.DEFAULT;
    private final String NAME = "Unknown";
    private final int FUEL_TANK_MAX = 0;
    private final int FUEL_TANK = 0;
    private final double WEIGHT = 0.0;
    private final double FUEL_CONSUMPTION = 0.0;
    private final int MAX_SPEED = 0;
    private final int CARRIAGE = 0;
    private final int MAX_CAPACITY = 0;

    protected PlaneProducer producer;
    protected String name;
    protected int fuelTankMax;
    protected int fuelTank;
    protected double weight;
    protected double fuelConsumption;
    protected int maxSpeed;
    protected int carriage;
    protected int maxCapacity;

    // конструктор
    public Plane() {
        this.producer = PRODUCER;
        this.name = NAME;
        this.fuelTank = FUEL_TANK;
        this.fuelTankMax = FUEL_TANK_MAX;
        this.weight = WEIGHT;
        this.fuelConsumption = FUEL_CONSUMPTION;
        this.maxSpeed = MAX_SPEED;
        this.carriage = CARRIAGE;
        this.maxCapacity = MAX_CAPACITY;
    }

    // геттеры и сеттеры
    public PlaneProducer getProducer() {
        return producer;
    }

    public void setProducer(PlaneProducer producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFuelTankMax() {
        return fuelTankMax;
    }

    public void setFuelTankMax(int fuelTankMax) {
        this.fuelTankMax = fuelTankMax;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFuelConsumption(double v) {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCarriage() {
        return carriage;
    }

    public void setCarriage(int carriage) {
        this.carriage = carriage;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    // получить дальность полета
    public double getFlightRange() {
        return (double) this.getFuelTank() / this.getFuelConsumption(10.0);
    }

    // готовность к полету
    @Override
    boolean isReadyForFly() {
        return false;
    }

    // toString

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Самолет ");
        sb.append(getName());
        return sb.toString();
    }
}
