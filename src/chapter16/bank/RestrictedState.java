package chapter16.bank;

//受限状态类
class RestrictedState extends AccountState {
    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败");
    }

    public void computeInterst() {
        System.out.println("计算利息");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormanlState(this));
        } else if (acc.getBalance() > -2000) {
            acc.setState(new OverdraftState());
        }
    }
}