public class Engine {

    private String type;
    private Country country;

    public Engine(String type, Country country) {
        this.type = type;
        this.country = country;
    }

    public String isV8engine(boolean type) {
        String message;
        return message = (type)? "to silnik v8" : "to nie jest silnik v8";
    }

    public void saveCountries() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", country=" + country +
                '}';
    }
}
