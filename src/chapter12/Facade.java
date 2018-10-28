package chapter12;

public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();

    public void method() {
        subSystemA.methodA();
        subSystemB.methodB();
    }
}
