package chapter06;

public class TShirt extends Finery {
    /**
     * 打扮
     *
     * @param component
     */
    public TShirt(Person component) {
        super(component);
    }

    @Override
    public void Show() {
        System.out.println("大T恤");
        super.Show();
    }
}
