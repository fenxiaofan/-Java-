package chapter10;

/**
 * 定期账户
 */
public class SavingAccount extends Account{

    @Override
    public void CalcuateInterest() {
        System.out.println("按定期利率计算");
    }
}
