package chapter14;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 支援盟友方法的实现
     */
    @Override
    public void help() {
        System.out.println("坚持住," + this.name + "来救你！");
    }

    /**
     * 遭受攻击方法的实现
     * @param acc
     */
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击");
        //调用通知方法通知盟友
        acc.notifyObserver(name);
    }
}
