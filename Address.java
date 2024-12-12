public class Address {
    private String location;
    private String country;

    public Address(String location, String country) {
        this.location = location;
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                ", country=" + country +
                '}';
    }
}
