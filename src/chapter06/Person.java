package chapter06;

public class Person {
    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    private String name;

    public void Show() {
        System.out.println("装扮的{0}" + this.name);
    }
}
