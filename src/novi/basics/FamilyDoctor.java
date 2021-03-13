package novi.basics;

public class FamilyDoctor extends Person{

    private String hospitalName;

    //constructor weggelaten

    //Getter hospitalname
    public String getHospitalName() {
        return hospitalName;
    }

    //Setter hospitalname
    public void setHospitalName(String hospitalName) {
        this.hospitalName=hospitalName;
    }

    //Super() in een methode gebruiken
    // via deze methode wordt de eat methode in de super klasse Person aangeroepen en uitgebreid met een parameter like en uitgebreid met if/else
    public void eat (String food, boolean like) {
        super.eat(food);
        if (like) {
            System.out.println(". And I like it. ");
        } else {
            System.out.println(". And it tastes awfull!");
        }

    }

    //Override gebruiken, deze methode wordt nu aangesproken in plaats van de methode work() in de superklasse Person

    @Override
    public void work() {
        System.out.println("I do family-doctor-work.");
    }



}
