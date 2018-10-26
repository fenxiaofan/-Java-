package chapter09;

public class ConcretePrototype3 implements Cloneable {
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

    public ConcretePrototype3 clone() {
        Object obj = null;
        try{
            obj = super.clone();
            return (ConcretePrototype3)obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            return null;
        }
    }
}
