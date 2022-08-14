import java.util.List;

public class Market {

    public String name;
    List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public String toString() {
        return getName()+","+" Countries: "+getCountries();
    }
}
