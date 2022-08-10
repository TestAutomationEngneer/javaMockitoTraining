import java.util.ArrayList;
import java.util.List;

public class Market {

    public String name;
    List<Country> countries;

    public Market(String name, List<Country> countries) {
        this.name = name;
        this.countries = countries;
    }
}
