package chapter06;

/**
 * 具体服饰类
 */
public class BigTrouser extends Finery{

    /**
     * 打扮
     *
     * @param component
     */
    public BigTrouser(Person component) {
        super(component);
    }

    @Override
    public void Show() {
        System.out.println("垮裤");
        super.Show();
    }
}
