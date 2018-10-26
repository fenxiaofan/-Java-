package chapter09;

public class ConcretePrototype implements Cloneable {
    private String name;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public ConcretePrototype clone() {
        Object obj = null;
        try{
            obj = super.clone();
            return (ConcretePrototype)obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
