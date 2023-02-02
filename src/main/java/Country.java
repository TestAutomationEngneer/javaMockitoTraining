import java.util.List;

public class Country {

    public String countryName;
    public char countryChar;

    public Country(String countryName, char countryChar) {
        this.countryName = countryName;
        this.countryChar = countryChar;
    }

    public String getCountryName() {
        return countryName;
    }

    public char getCountryChar() {
        return countryChar;
    }

    public List<String> getStringList() {
        return List.of("Item1", "Item2");
    }
    public int calculateProcent(boolean isProcent) {
        int result;
        return result = (isProcent) ? 20 : 150;
    }

    public int countriesOfTheWorld(boolean toggle) {
        int result;
        return result = (toggle) ? 123: 0;
    }

    @Override
    public String toString() {
        return getCountryName() + " - " + getCountryChar();
    }
}
