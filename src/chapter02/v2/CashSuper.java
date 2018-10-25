package chapter02.v2;

/**
 * 现金收取抽象类（子类实现具体的收费类型：收全款、打折、满减优惠）
 */
public abstract class CashSuper {
    /**
     * 实际收取的金钱
     * @param money 结算金钱树
     * @return
     */
    public abstract double acceptCash(double money);
}
