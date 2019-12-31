package myairlines.aircraft;

public class CargoPlane extends Plane{

    protected final int TAKE_OFF_SPEED = 350;

    protected String carriageType;

    // конструктор
    public CargoPlane() {
    }

    // сеттеры и геттеры
    public String getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(String carriageType) {
        this.carriageType = carriageType;
    }

    // toString
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Грузовой самолет ");
        sb.append(getProducer()).append(" ");
        sb.append(getName()).append("\n");
        sb.append("Дальность полета: ").append(getFlightRange()).append(" часов, ");
        sb.append(getFuelTank()).append(" литров топлива осталось. ");
        sb.append("Потребление топлива: ").append(getFuelConsumption(10.0));
        sb.append(", скорость: ").append(getMaxSpeed());
        sb.append(", масса допустимого груза: ").append(getMaxCapacity());
        sb.append(", тип груза: ");
        sb.append(getCarriageType());
        return sb.toString();
    }
}
