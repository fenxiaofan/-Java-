package chapter02.v2;

/**
 * 正常收取，没有优惠
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
