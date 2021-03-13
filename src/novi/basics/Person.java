package novi.basics;

public class Person {

    //attributen
    private String firstName;
    private String lastName;
    private String streetName;
    private String bsnNumber;
    private double balance;

    //Lege Constructor
    public Person() {
    }

    public Person(String firstName, String lastName, String streetName, String bsnNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.bsnNumber = bsnNumber;
    }


    //Getter firstName
    public String getfirstName() {
        return firstName;
    }

    //Getter lastName
    public String getlastName() {
        return lastName;
    }

    //Getter streetName;
    public String getstreetName() {
        return streetName;
    }

    //Getter bsnNumber;
    public String getbsnNumber() {
        return bsnNumber;
    }

    //Getter balance
    public double getBalance() {
        return balance;
    }

    //Setter firstName
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    //Setter lastName
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    //Setter streetName;
    public void setstreetName(String streetName) {
        this.streetName = streetName;
    }

    //Setter bsnNumber;
    public void setbsnNumber(String bsnNumber) {
        this.bsnNumber = bsnNumber;
    }

    //Setter balance
    public void setBalance(double balance) {
        this.balance=balance;
    }


    //Methods
    public void eat(String food) {
        System.out.println("I eat " + food);
    }


    public void work() {
        System.out.println("The person works");
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + streetName + " " + bsnNumber;
    }

}