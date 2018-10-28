package chapter13;

public class ConcreteBuilder extends Builder {
    Product product = new Product();

    @Override
    public void BuilderPartA() {
        System.out.println("装配部件A");
    }

    @Override
    public void BuilderPartB() {
        System.out.println("装配部件B");
    }

    @Override
    public void BuilderPartC() {
        System.out.println("装配部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
