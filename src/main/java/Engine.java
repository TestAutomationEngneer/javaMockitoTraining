public class Engine {

    private String type;


    public Engine(String type) {
        this.type = type;
    }

    public Engine() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String gearHandler(int gears) {
        return "Skrzynia jest " + gears + " biegowa";
    }

    public double calculateEnginePower(int units) {
        return units * 0.55 ;
    }
    public double showEnginePower(int units) {
        double result = calculateEnginePower(units);
        return result + 2.00;
    }

}
