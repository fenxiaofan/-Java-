package chapter15;

public class ConcreteHaierFactory extends HaierFactory {
    @Override
    public TV createTV() {
        return new HaierTV();
    }

    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }
}
