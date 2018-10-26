package chapter09;

import java.io.*;

/**
 * 实现深复制(实现Serializable接口)
 */
public class ConcretePrototype2 implements Serializable {
    private static final long serialVersionUID = -6435322050650520862L;
    private String name;
    private Weapon weapon;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ConcretePrototype2 deepClone() throws IOException, ClassNotFoundException {
        //将对象写进流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        //将对象从流中读出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ConcretePrototype2)ois.readObject();
    }
}
