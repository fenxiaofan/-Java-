package chapter08;

import chapter01.v2.Operation;
import chapter01.v2.Operationsub;

/**
 * 减法工厂
 */
public class SubFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new Operationsub();
    }
}
