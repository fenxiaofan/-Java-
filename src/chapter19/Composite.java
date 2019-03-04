package chapter19;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.add(c);
    }

    public Component getChild(int i) {
        return (Componenet)list.get(i);
    }

    public void operation() {
        for(Object obj:list) {
            ((Component)obj).operation();
        }
    }
}