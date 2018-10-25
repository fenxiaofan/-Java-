package chapter02.v2;

public class CashContext {
    private CashSuper cashSuper;

    /**
     * 通过构造方法传入具体的收费策略
     * @param cashSuper
     */
    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    /**
     * 根据收费策略的不同返回不同的计算结果
     * @param money
     * @return
     */
    public double GetResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
