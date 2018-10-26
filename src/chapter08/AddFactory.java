package chapter08;

import chapter01.v2.Operation;
import chapter01.v2.Operationadd;

/**
 * 加法工厂
 */
public class AddFactory implements IFactory {
    @Override
    public Operation CreateOperation() {
        return new Operationadd();
    }
}
