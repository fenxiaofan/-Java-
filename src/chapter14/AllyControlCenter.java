package chapter14;

import java.util.ArrayList;

/**
 * 目标类
 */
public abstract class AllyControlCenter {
    protected String allyName; //战队名称
    protected ArrayList<Object> players = new ArrayList<>();//用于存储战队队员的集合

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    /**
     * 注册方法
     * @param obs
     */
    public void join(Observer obs) {
        System.out.println(obs.getName() + "加入" + this.allyName + "战队!");
        players.add(obs);
    }

    /**
     * 注销方法
     * @param obs
     */
    public void quit(Observer obs) {
        System.out.println(obs.getName() + "退出" + this.allyName + "战队!");
        players.remove(obs);
    }

    /**
     * 声明抽象通知方法
     * @param name
     */
    public abstract void notifyObserver(String name);
}
