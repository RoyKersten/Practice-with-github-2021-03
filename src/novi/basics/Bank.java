package novi.basics;

public class Bank {

    public void transferMoney (Person sender, Person receipent, double amount) {
        if(amount > sender.getBalance()) {
            System.out.println("The sender does not have enough money");
        } else {
            sender.setBalance((sender.getBalance())- amount);
            receipent.setBalance((receipent.getBalance())+amount);
        }
    }

}
