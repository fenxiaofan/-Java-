package chapter15;

/**
 * 抽象工厂，用于生产海尔产品族
 */
public abstract class HaierFactory {
    //生产电视机
    public abstract TV createTV();
    //生产冰箱
    public abstract Fridge createFridge();
}
