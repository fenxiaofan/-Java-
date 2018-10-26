package chapter08;

import chapter01.v2.Operation;
import chapter01.v2.Operationdiv;

public class DivFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new Operationdiv();
    }
}
