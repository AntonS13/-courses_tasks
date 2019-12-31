package myairlines.aircraft;

public class PassengerPlane extends Plane {

    protected int seatOnAirplane;

    protected final int TAKE_OFF_SPEED = 300;

    // конструктор
    public PassengerPlane() {
    }

    // геттеры и сеттеры
    public int getSeatOnAirplane() {
        return seatOnAirplane;
    }

    public void setSeatOnAirplane(int seatOnAirplane) {
        this.seatOnAirplane = seatOnAirplane;
    }

    // toString
    public String toString() {
        final StringBuilder sb = new StringBuilder("Самолет ");
        sb.append(getProducer()).append(" ");
        sb.append(getName()).append(" \n");
        sb.append("Дальность полета: ").append(getFlightRange()).append(" часов, ");
        sb.append(getFuelTank()).append(" литров топлива осталось. ");
        sb.append("Потребление топлива: ").append(getFuelConsumption(10.0));
        sb.append(", скорость: ").append(getMaxSpeed());
        sb.append(", места для пассажиров: ");
        sb.append(getSeatOnAirplane());
        return sb.toString();
    }
}
