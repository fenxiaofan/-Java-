package chapter13;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder();

        director.Constructor(b1);
        Product product = b1.getResult();
    }
}
