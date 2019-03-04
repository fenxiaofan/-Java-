package chapter16.bank;

abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterst();
    public abstract void stateCheck();
}