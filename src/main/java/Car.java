import java.util.ArrayList;

public class Car {

    Manufacturer manufacturer;
    public boolean isAutomaticGear;
    Market market;
    public String segment;
    Dimension dimensions;

    ArrayList<Dimension> dimensionList;
    ArrayList<Country> countries;

    public Car(Manufacturer manufacturer, boolean isAutomaticGear, Market market, String segment, Dimension dimension) {
        this.manufacturer = manufacturer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimension;
    }
}
