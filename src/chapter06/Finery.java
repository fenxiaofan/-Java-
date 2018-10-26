package chapter06;

/**
 * 抽象装饰类(Decorator)
 */
public class Finery extends Person{

    private   Person component;

    /**
     * 打扮
     * @param component
     */
    public Finery(Person component) {
        this.component = component;
    }

    @Override
    public void Show() {
        if(component != null) {
            component.Show();   //调用原有的方法
        }
    }
}
