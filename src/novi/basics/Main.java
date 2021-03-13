package novi.basics;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

   //Super class Person, Subclass Family Doctor
    FamilyDoctor familyDoctor= new FamilyDoctor();

    familyDoctor.setlastName("Peter ");
    familyDoctor.setHospitalName("Princeton");

        System.out.println("Doctor " + familyDoctor.getlastName() + "works at " + familyDoctor.getHospitalName() );

        familyDoctor.eat("Spinach");
        familyDoctor.work();
        System.out.println("\n");

        //Class FamilyDoctor uitgebreid met methode eat die een super() bevat en zodoende methode eat() in Person aanroept en uitbreid.

        familyDoctor.eat("Grass", false);
        System.out.println("\n");

        //Subclass Handyman extends Superclass Person with super in constructor
        Handyman handyman=new Handyman("Sjaak", "Timmerman", "Oudegracht", "02345678", "12-AAS-15");
        System.out.println("Het kenteken is " + handyman.getLicensePlateNumber());


        System.out.println("\n"+"Polymorphism");

        //Polymorphism
        Person someDoctor = new FamilyDoctor();
        someDoctor.setfirstName("Roy");
        someDoctor.setlastName("Kersten");
        someDoctor.setstreetName("Brahmslaan");
        someDoctor.setbsnNumber("123456789");


        Person someHandyman = new Handyman("Sjaak","Metselaar", "Keizersgracht", "012345678", "1-AAA-2");

        //Deze list bevat Person-objcten
        List<Person> persons = new ArrayList<>();

        // We gooien een FamilyDoctor object in de List die een Person verwacht.
        persons.add(someDoctor);

        // We gooien een FamilyDoctor object in de List die een Person verwacht.
        persons.add(someHandyman);

        int i=0;
        for(Person p: persons) {
            // we kunnen hier elke methode aanroepen die ook in de Person-klasse staat.
            System.out.println(persons.get(i).toString());
            p.work();
            p.eat("Salad");
            i++;
        }

        // Bank
        System.out.println("\n"+"Bank transaction");

        Bank bank = new Bank();

        someDoctor.setBalance(12000.00);

        someHandyman.setBalance(800.00);

        bank.transferMoney(someHandyman,someDoctor, 799.00);

        System.out.println("Doctor's balance: " + someDoctor.getBalance());
        System.out.println("Handyman's balance: " + someHandyman.getBalance());

    }


}
