package chapter06;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("小凡");
        BigTrouser bigTrouser = new BigTrouser(person);
        bigTrouser.Show();

        TShirt tShirt = new TShirt(bigTrouser);
        tShirt.Show();

    }
}
