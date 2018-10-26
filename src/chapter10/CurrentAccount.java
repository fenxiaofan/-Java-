package chapter10;

/**
 * 活期账户
 */
public class CurrentAccount extends Account{

    @Override
    public void CalcuateInterest() {
        System.out.println("按活期利率计算！");
    }
}
