import java.util.ArrayList;

public class Car {

    Manufacturer manufacturer;
    public boolean isAutomaticGear;
    Market market;
    public String segment;
    ArrayList<Dimension> dimensions;

    public Car(Manufacturer manufacturer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.manufacturer = manufacturer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }
    public String getSegment() {
        return segment;
    }
}
