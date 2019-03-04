package chapter16.bank;

//银行账户环境类
class Account {
    private AccountState state;//维持一个对抽象状态的引用
    private String owner;//开户名
    private double balance = 0;//账户余额

    public Account(String owner,double init) {
        this.owner = owner;
        this.balance = init;
        this.state = new NormalState(this);//设置初始状态
        System.out.println(this.owner + "开户，初始金额为" + init);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.owner + "存款" + amount);
        state.deposit(amount);//调用状态对象的deposit方法
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为" + this.state.getClass().getName());
        System.out.println("_______________________________________________");
    }

    public void withdraw(double amount) {
        System.out.println(this.owner + "取款" + amount);
        state.withdraw(amount);
        System.out.println("现在余额为" + this.balance);
        System.out.println("现在账户状态为" + this.state.getClass().getName());
        System.out.println("_______________________________________________");
    }

    public void computeInterst()
	{
		state.computeInterst(); //调用状态对象的computeInterest()方法
	}

}