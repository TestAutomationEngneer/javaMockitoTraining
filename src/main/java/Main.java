import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'D');
        Country spain = new Country("Spain", 'E');
        Country france = new Country("France", 'F');
        Country denmark = new Country("Denmark", 'D');

        List<Country> market1 = new ArrayList<>();
        market1.add(poland);
        market1.add(denmark);
        market1.add(germany);

        List<Country> market2 = new ArrayList<>();
        market2.add(spain);
        market2.add(france);
        market2.add(germany);

        List<Country> market3 = new ArrayList<>();
        market3.add(poland);
        market3.add(denmark);
        market3.add(spain);

        Market business = new Market("Business", market1);
        Market premium = new Market("Premium", market2);
        Market transport = new Market("Transport", market3);
        Market cargo = new Market("Cargo", market2);
        Market taxi = new Market("Taxi", market1);

        Manufacturer bmw = new Manufacturer("BMW", "T1");
        Manufacturer bmw1 = new Manufacturer("BMW", "T2");
        Manufacturer bmw2 = new Manufacturer("BMW", "T3");
        Manufacturer bmw3 = new Manufacturer("BMW", "T4");
        Manufacturer vw = new Manufacturer("VW", "T1");
        Manufacturer vw1 = new Manufacturer("VW", "T2");
        Manufacturer vw2 = new Manufacturer("VW", "T3");
        Manufacturer vw3 = new Manufacturer("VW", "T4");
        Manufacturer toyota = new Manufacturer("Toyota", "T1");
        Manufacturer toyota1 = new Manufacturer("Toyota", "T2");

        ArrayList<Dimension> dimensions1 = new ArrayList<>();
        dimensions1.add(new Dimension(100, 150, 400));
        ArrayList<Dimension> dimensions2 = new ArrayList<>();
        dimensions2.add(new Dimension(100, 170, 400));
        ArrayList<Dimension> dimensions3 = new ArrayList<>();
        dimensions3.add(new Dimension(150, 200, 450));
        ArrayList<Dimension> dimensions4 = new ArrayList<>();
        dimensions4.add(new Dimension(120, 160, 350));
        ArrayList<Dimension> dimensions5 = new ArrayList<>();
        dimensions5.add(new Dimension(100, 150, 250));
        ArrayList<Dimension> dimensions6 = new ArrayList<>();
        dimensions6.add(new Dimension(200, 180, 300));
        ArrayList<Dimension> dimensions7 = new ArrayList<>();
        dimensions7.add(new Dimension(130, 145, 480));
        ArrayList<Dimension> dimensions8 = new ArrayList<>();
        dimensions8.add(new Dimension(90, 150, 250));
        ArrayList<Dimension> dimensions9 = new ArrayList<>();
        dimensions9.add(new Dimension(145, 210, 500));
        ArrayList<Dimension> dimensions10 = new ArrayList<>();
        dimensions10.add(new Dimension(100, 150, 300));

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(bmw, true, business, "premium", dimensions1));
        carList.add(new Car(bmw1, false, premium, "medium", dimensions2));
        carList.add(new Car(bmw2, true, transport, "standard", dimensions10));
        carList.add(new Car(bmw3, false, business, "premium", dimensions5));
        carList.add(new Car(vw, true, cargo, "medium", dimensions7));
        carList.add(new Car(toyota, true, business, "medium", dimensions3));
        carList.add(new Car(bmw2, false, transport, "premium", dimensions1));
        carList.add(new Car(vw3, true, business, "medium", dimensions8));
        carList.add(new Car(bmw, true, taxi, "premium", dimensions4));
        carList.add(new Car(bmw1, false, business, "standard", dimensions6));
        carList.add(new Car(vw2, false, transport, "premium", dimensions9));
        carList.add(new Car(toyota1, true, business, "standard", dimensions7));
        carList.add(new Car(bmw, true, transport, "medium", dimensions3));
        carList.add(new Car(vw1, false, cargo, "premium", dimensions1));
        carList.add(new Car(bmw2, true, taxi, "standard", dimensions10));
    }
}
