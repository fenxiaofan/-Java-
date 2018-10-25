package chapter02.v1;

/**
 * 返利收费子类(如满200减20)
 */
public class CashReturn extends CashSuper {
    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if(money > moneyCondition)
            result = money - Math.floor(money-moneyCondition) * moneyReturn;
        return result;
    }
}
