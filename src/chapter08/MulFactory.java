package chapter08;

import chapter01.v2.Operation;
import chapter01.v2.Operationmul;

public class MulFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new Operationmul();
    }
}
