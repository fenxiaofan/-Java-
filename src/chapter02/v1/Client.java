package chapter02.v1;

/**
 * 客户端调用
 */
public class Client {
    public static void main(String[] args) {
        CashSuper cashSuper = CashFactory.createCashAccept("打8折");

    }
}
