package chapter19;

public abstract class Component {
    public abstract void add(Component c);//添加构件
    public abstract void remove(Component c);//移除构件 
    public abstract Component getChild(int i);//获取成员
    public abstract void operation();//业务方法
}