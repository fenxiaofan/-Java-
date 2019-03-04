package chapter16.bank;

class client {
    public static void main(String[] args) {
        Account account = new Account("小凡", 0.0);
        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterst();
    }

    // public static void main(String[] args) {
    //     System.out.println("hello world");
    // }
}