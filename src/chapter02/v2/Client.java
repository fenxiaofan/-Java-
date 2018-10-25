package chapter02.v2;

public class Client {
    public static void main(String[] args) {
        String type = "打8折";
        CashContext cashContext = null;
        switch (type) {
            case "正常收费":
                cashContext = new CashContext(new CashNormal());
                break;
            case "满300减100":
                cashContext = new CashContext(new CashReturn(300,100));
                break;
            case  "打8折":
                cashContext = new CashContext(new CashRebate(0.8));
                break;
        }
        //此时还可以把策略模式和简单工厂模式向结合，把Switch移动到Conetext中，此时工厂是和Context结合的。
    }
}
