import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country spain = new Country("Spain", 'E');
        Country france = new Country("France", 'F');
        Country denmark = new Country("Denmark", 'D');

        List<Country> countriesBusiness = new ArrayList<>();
        countriesBusiness.add(france);
        countriesBusiness.add(denmark);
        countriesBusiness.add(germany);

        List<Country> countriesPremium = new ArrayList<>();
        countriesPremium.add(spain);
        countriesPremium.add(france);
        countriesPremium.add(denmark);

        List<Country> countriesTransport = new ArrayList<>();
        countriesTransport.add(poland);
        countriesTransport.add(germany);
        countriesTransport.add(spain);

        List<Country> countriesCargo = new ArrayList<>();
        countriesCargo.add(poland);
        countriesCargo.add(denmark);
        countriesCargo.add(spain);

        List<Country> countriesTaxi = new ArrayList<>();
        countriesTaxi.add(poland);
        countriesTaxi.add(france);
        countriesTaxi.add(germany);

        Market business = new Market("Business", countriesBusiness);
        Market premium = new Market("Premium", countriesPremium);
        Market transport = new Market("Transport", countriesTransport);
        Market cargo = new Market("Cargo", countriesCargo);
        Market taxi = new Market("Taxi", countriesTaxi);

        Manufacturer bmw = new Manufacturer("BMW", "T1");
        Manufacturer bmw1 = new Manufacturer("BMW", "T2");
        Manufacturer bmw2 = new Manufacturer("BMW", "T3");
        Manufacturer volvo = new Manufacturer("Volvo", "T6");
        Manufacturer volvo2 = new Manufacturer("Volvo", "T1");
        Manufacturer vw = new Manufacturer("VW", "T2");
        Manufacturer vw1 = new Manufacturer("VW", "T3");
        Manufacturer skoda = new Manufacturer("Skoda", "T4");
        Manufacturer toyota = new Manufacturer("Toyota", "T1");
        Manufacturer toyota1 = new Manufacturer("Toyota", "T2");

        ArrayList<Dimension> dimensions = new ArrayList<>();
        dimensions.add(new Dimension(180, 200, 700));
        ArrayList<Dimension> dimensions1 = new ArrayList<>();
        dimensions1.add(new Dimension(120, 180, 350));
        ArrayList<Dimension> dimensions2 = new ArrayList<>();
        dimensions2.add(new Dimension(150, 200, 450));
        ArrayList<Dimension> dimensions3 = new ArrayList<>();
        dimensions3.add(new Dimension(120, 160, 350));
        ArrayList<Dimension> dimensions4 = new ArrayList<>();
        dimensions4.add(new Dimension(100, 150, 650));
        ArrayList<Dimension> dimensions5 = new ArrayList<>();
        dimensions5.add(new Dimension(200, 180, 310));
        ArrayList<Dimension> dimensions6 = new ArrayList<>();
        dimensions6.add(new Dimension(130, 145, 480));
        ArrayList<Dimension> dimensions7 = new ArrayList<>();
        dimensions7.add(new Dimension(90, 150, 250));
        ArrayList<Dimension> dimensions8 = new ArrayList<>();
        dimensions8.add(new Dimension(145, 210, 500));
        ArrayList<Dimension> dimensions9 = new ArrayList<>();
        dimensions9.add(new Dimension(100, 150, 300));

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(bmw, true, business, "medium", dimensions3));
        carList.add(new Car(bmw1, false, premium, "premium", dimensions9));
        carList.add(new Car(skoda, true, transport, "standard", dimensions6));
        carList.add(new Car(volvo, false, business, "standard", dimensions));
        carList.add(new Car(vw, true, cargo, "premium", dimensions4));
        carList.add(new Car(toyota, true, business, "medium", dimensions3));
        carList.add(new Car(bmw2, false, transport, "premium", dimensions8));
        carList.add(new Car(volvo2, true, business, "medium", dimensions2));
        carList.add(new Car(bmw, false, taxi, "premium", dimensions5));
        carList.add(new Car(bmw1, false, business, "standard", dimensions1));
        carList.add(new Car(vw, false, transport, "premium", dimensions7));
        carList.add(new Car(toyota1, true, business, "standard", dimensions2));
        carList.add(new Car(bmw, true, transport, "medium", dimensions4));
        carList.add(new Car(vw1, false, cargo, "premium", dimensions9));
        carList.add(new Car(bmw2, true, taxi, "standard", dimensions7));

        System.out.println("Complete list of cars:");
        for (Car car : carList)
            System.out.println(car.getManufacturer() + "," + " is automatic: "
                    + car.isAutomaticGear() + "," + " Market: " + car.getMarket() + ","
                    + " Segment: " + car.getSegment() + "," + " Dimensions:" + car.getDimensions().toString());

        System.out.println("Countries with BMW Manufacturer and Automatic Gear:");
        for (Car car : carList) {
            if (car.getManufacturer().getModel().equals("BMW")) {
                if (car.isAutomaticGear()) {
                    System.out.println(car.getMarket().getCountries());
                }
            }
        }
    }
}
