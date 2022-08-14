public class Manufacturer {

    public String model;
    public String type;

    public Manufacturer(String model, String type) {
        this.model = model;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return " Model: " + getModel() + " type: " + getType();
    }
}
