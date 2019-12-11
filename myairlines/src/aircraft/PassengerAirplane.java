package aircraft;

import aircraft.Aircraft;

public class PassengerAirplane extends Airplane {
    protected final int TAKE_OFF_SPEED = 300;

    protected int seating;
    protected String departure;
    protected String destination;

    // constructor
    public PassengerAirplane() {
    }

    // Getters & Setters
    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airliner ");
        sb.append(getProducer()).append(" ");
        sb.append(getName()).append(" \n");
        sb.append("Flight range: ").append(getFlghtRange()).append(" hours, ");
        sb.append(getFuelTank()).append(" litters of fuel left. ");
        sb.append("Fuel consumption: ").append(getFuelConsumption());
        sb.append(", speed: ").append(getMaxSpeed());
        sb.append(", carries: ");
        sb.append(getSeating()).append(" passengers.");
        return sb.toString();
    }
}
