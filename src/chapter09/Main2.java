package chapter09;

import java.io.IOException;

/**
 * 深复制 vs 浅复制
 */
public class Main2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //深复制
        ConcretePrototype2 concretePrototype2 = new ConcretePrototype2();
        Weapon weapon = new Weapon("金箍棒");
        concretePrototype2.setName("孙悟空");
        concretePrototype2.setWeapon(weapon);
        concretePrototype2.setAge(120);

        ConcretePrototype2 concretePrototype2Clone = concretePrototype2.deepClone();
        System.out.println("name: " + (concretePrototype2.getName() == concretePrototype2Clone.getName()));
        System.out.println("weapon: " + (concretePrototype2.getWeapon() == concretePrototype2Clone.getWeapon()));
        System.out.println("age: " + (concretePrototype2.getAge() == concretePrototype2.getAge()));

        System.out.println("--------------------------------");

        //浅复制
        ConcretePrototype3 concretePrototype3 = new ConcretePrototype3();
        Weapon weapon2 = new Weapon("金箍棒");
        concretePrototype2.setName("孙悟空");
        concretePrototype2.setWeapon(weapon2);
        concretePrototype2.setAge(120);

        ConcretePrototype3 concretePrototype3Clone = concretePrototype3.clone();
        System.out.println("name: " + (concretePrototype3.getName() == concretePrototype3Clone.getName()));
        System.out.println("weapon: " + (concretePrototype3.getWeapon() == concretePrototype3Clone.getWeapon()));
        System.out.println("age: " + (concretePrototype3.getAge() == concretePrototype3Clone.getAge()));

    }

}
