package chapter15;

/**
 * 抽象工厂，用于生产TCL产品族
 */
public abstract class TCLFactory {
    public abstract TV createTV();
    public abstract Wash createWash();
}
