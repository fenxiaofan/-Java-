package chapter15;

public class ConcreteTCLFactory extends TCLFactory {
    @Override
    public TV createTV() {
        return new TCLTV();
    }

    @Override
    public Wash createWash() {
        return new TCLWash();
    }
}
