package chapter14;

/**
 * 抽象观察者类
 */
public interface Observer {
    String getName();
    void setName(String name);
    void help();
    void beAttacked(AllyControlCenter acc);
}
