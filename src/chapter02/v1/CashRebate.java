package chapter02.v1;

/**
 * 打折收取
 */
public class CashRebate extends CashSuper {

    /**
     * 打折数
     */
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
