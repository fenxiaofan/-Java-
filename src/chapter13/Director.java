package chapter13;

/**
 * 指挥者类
 */
public class Director {
    public void Constructor(Builder builder) {
        builder.BuilderPartA();
        builder.BuilderPartB();
        builder.BuilderPartC();
    }
}
