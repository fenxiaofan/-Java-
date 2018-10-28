package chapter13;

public abstract class Builder {
    public abstract void BuilderPartA();
    public abstract void BuilderPartB();
    public abstract void BuilderPartC();

    /**
     * 得到产品建造后结果的方法
     * @return
     */
    public abstract Product getResult();
}
