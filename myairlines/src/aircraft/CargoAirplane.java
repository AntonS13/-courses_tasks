package aircraft;

public class CargoAirplane extends Airplane{

    protected final int TAKE_OFF_SPEED = 350;

    protected String carriageType;
    protected String sender;
    protected String client;

    protected CargoAirplane() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getCarriageType() {
        return carriageType;
    }

    public void setCarriageType(String carriageType) {
        this.carriageType = carriageType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commercial airliner ");
        sb.append(getProducer()).append(" ");
        sb.append(getName()).append("\n");
        sb.append("Flight range: ").append(getFlghtRange()).append(" hours, ");
        sb.append(getFuelTank()).append(" litters of fuel left. ");
        sb.append("Fuel consumption: ").append(getFuelConsumption());
        sb.append(", speed: ").append(getMaxSpeed());
        sb.append(", carries: ").append(getMaxCapacity());
        sb.append(" tons of ");
        sb.append(getCarriageType());
        return sb.toString();
    }
}
