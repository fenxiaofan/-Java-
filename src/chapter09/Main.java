package chapter09;

/**
 * 原型模式
 */
public class Main {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();  //创建原型对象
        concretePrototype.setName("张无忌");
        concretePrototype.setContent("乾坤大挪移");
        System.out.println(concretePrototype);

        ConcretePrototype concretePrototypeNew;
        concretePrototypeNew = concretePrototype.clone(); //调用克隆方法创建克隆对象
        concretePrototypeNew.setContent("九阳神功");
        System.out.println(concretePrototypeNew);
    }
}
