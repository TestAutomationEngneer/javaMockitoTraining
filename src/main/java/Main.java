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

        Dimension dimension1 = new Dimension(100, 150, 400);
        Dimension dimension2 = new Dimension(150, 200, 450);
        Dimension dimension3 = new Dimension(120, 160, 350);
        Dimension dimension4 = new Dimension(100, 150, 250);
        Dimension dimension5 = new Dimension(200, 180, 300);
        Dimension dimension6 = new Dimension(130, 145, 480);
        Dimension dimension7 = new Dimension(90, 150, 250);
        Dimension dimension8 = new Dimension(145, 210, 500);
        Dimension dimension9 = new Dimension(100, 150, 300);
        Dimension dimension10 = new Dimension(100, 170, 400);

        ArrayList<Dimension> dimensionList = new ArrayList<>();
        dimensionList.add(dimension1);
        dimensionList.add(dimension2);
        dimensionList.add(dimension3);
        dimensionList.add(dimension4);
        dimensionList.add(dimension5);
        dimensionList.add(dimension6);
        dimensionList.add(dimension7);
        dimensionList.add(dimension8);
        dimensionList.add(dimension9);
        dimensionList.add(dimension10);

        Manufacturer bmw = new Manufacturer("BMW", "T1");
        Manufacturer bmw1 = new Manufacturer("BMW", "T2");
        Manufacturer bmw2 = new Manufacturer("BMW", "T3");
        Manufacturer bmw4 = new Manufacturer("BMW", "T4");
        Manufacturer vw = new Manufacturer("VW", "T1");
        Manufacturer vw1 = new Manufacturer("VW", "T2");
        Manufacturer vw2 = new Manufacturer("VW", "T3");
        Manufacturer vw3 = new Manufacturer("VW", "T4");
        Manufacturer toyota = new Manufacturer("Toyota", "T1");
        Manufacturer toyota1 = new Manufacturer("Toyota", "T2");

        //utworzyc kilka car przykladow?

    }
}
