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

    @Override
    public String toString() {
        return getCountryName() + " - " + getCountryChar();
    }
}
