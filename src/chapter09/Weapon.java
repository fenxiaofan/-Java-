package chapter09;

import java.io.Serializable;

public class Weapon implements Serializable{
    private static final long serialVersionUID = -4213582623674421174L;
    private String name;

    public Weapon() {
    }

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
