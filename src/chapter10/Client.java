package chapter10;

public class Client {
    public static void main(String[] args) {
        Account account = null;
        String type = "活期账户";
        switch (type) {
            case "活期账户":
                account = new CurrentAccount();
                break;
            case "定期账户":
                account = new SavingAccount();
                break;
        }

        account.Handle("张无忌","123456");
    }
}
