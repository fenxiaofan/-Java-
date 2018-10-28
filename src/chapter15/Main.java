package chapter15;

public class Main {
    public static void main(String[] args) {
        HaierFactory haierFactory = new ConcreteHaierFactory();
        TV haierTV = haierFactory.createTV();
        Fridge haierFridge = haierFactory.createFridge();
        haierTV.watch();
        haierFridge.store();

        TCLFactory tclFactory = new ConcreteTCLFactory();
        TV tclTV = tclFactory.createTV();
        Wash tclwash = tclFactory.createWash();
        tclTV.watch();
        tclwash.wash();
    }
}
