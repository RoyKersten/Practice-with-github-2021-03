package novi.basics;

public class Handyman extends Person {

    //attributen
    private String licensePlateNumber;

    // Constructor met super
    // Deze constructor ontvangt 1 parameter meer dan de constructor van Person.

    public Handyman(String firstName, String lastName, String streetName, String bsnNumber, String licensePlateNumber) {
        super (firstName, lastName,streetName,bsnNumber);
        this.licensePlateNumber=licensePlateNumber;

    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber=licensePlateNumber;
    }

    //methoden


}
