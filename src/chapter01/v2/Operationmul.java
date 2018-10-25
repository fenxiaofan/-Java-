package chapter01.v2;

public class Operationmul extends Operation {
    @Override
    public double getResult() {
        double result = 0 ;
        result = numberA * numberB;
        return result;
    }
}
