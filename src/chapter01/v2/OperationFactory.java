package chapter01.v2;
/**
 * 简单工厂类
 * @author Administrator
 *
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch(operate) {
            case "+":
                operation = new Operationadd();
                break;
            case "-":
                operation = new Operationsub();
                break;
            case "*":
                operation = new Operationmul();
                break;
            case "/":
                operation = new Operationdiv();
                break;
        }
        return operation;
    }
}
