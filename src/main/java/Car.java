public class Car {

   private Engine engine;
   private String producer;

    public Car(Engine engine, String producer) {
        this.engine = engine;
        this.producer = producer;
    }

    public Car() {
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int calculatePricePlusVat(int price) {
       return price+3333;
    }

    public int doorCount() {
        return 4;
    }
}
