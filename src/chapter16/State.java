package chapter16;

abstract class State {

    //声明抽象业务方法，不同具体状态类可以有不同的实现
    public abstract void handle();
}