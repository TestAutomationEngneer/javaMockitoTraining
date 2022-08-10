import java.util.List;

public class CarInfo {
    public static void main(String[] args) {
        Country poland = new Country("Poland", 'P');
        Country germany = new Country("Germany", 'G');
        Country spain = new Country("Spain", 'E');
        Country switzerland = new Country("Switzerland", 'Z');
        Country portugal = new Country("Portugal", 'P');

        Market business = new Market("business", (List<Country>) poland);
        Market personal = new Market("personal", (List<Country>) germany);
        Market bus = new Market("personal", (List<Country>) spain);
        Market taxi = new Market("personal", (List<Country>) switzerland);
        Market transport = new Market("personal", (List<Country>) portugal);

        Dimensions dimensions1 = new Dimensions(120,200,250);
        Dimensions dimensions2 = new Dimensions(130,210,270);
        Dimensions dimensions3 = new Dimensions(110,190,310);
        Dimensions dimensions4 = new Dimensions(80,180,300);
        Dimensions dimensions5 = new Dimensions(95,200,150);
        Dimensions dimensions6 = new Dimensions(140,200,350);
        Dimensions dimensions7 = new Dimensions(160,280,250);
        Dimensions dimensions8 = new Dimensions(120,240,275);
        Dimensions dimensions9 = new Dimensions(100,230,300);
        Dimensions dimensions10 = new Dimensions(120,205,205);

        Manufacturer bmw1 = new Manufacturer("BMW", "I4");
        Manufacturer bmw2 = new Manufacturer("BMW", "I4 M50");
        Manufacturer bmw3 = new Manufacturer("BMW", "IX");
        Manufacturer bmw4 = new Manufacturer("BMW", "IX1");
        Manufacturer bmw5 = new Manufacturer("BMW", "IX3");
        Manufacturer bmw6 = new Manufacturer("BMW", "COUPE");
        Manufacturer bmw7 = new Manufacturer("BMW", "GRAN");
        Manufacturer bmw8 = new Manufacturer("BMW", "CABRIO");
        Manufacturer bmw9 = new Manufacturer("BMW", "M3");
        Manufacturer bmw10 = new Manufacturer("BMW", "M440");
    }
}
