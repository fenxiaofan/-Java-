package chapter13;

/**
 * 产品角色，被构建的复杂对象，包含多个组件
 */
public class Product {
    private String partA;//定义部件，部件可以是任意类型，包括值类型和引用类型
    private String partB;
    private String partC;

    public String getPartA() {
        return partA;
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public String getPartB() {
        return partB;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public String getPartC() {
        return partC;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }
}
