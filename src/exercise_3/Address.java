package exercise_3;

public class Address {
    private String city;
    private String street;
    private String foundation;

    public Address(){

    }

    public Address(String city, String street, String foundation) {
        this.city = city;
        this.street = street;
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", foundation='" + foundation + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
}
