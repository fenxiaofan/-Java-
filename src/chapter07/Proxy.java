package chapter07;

public class Proxy implements Subject {
    private static RealSubject realSubject = new RealSubject();
    @Override
    public void Request() {
        System.out.println("我是经纪人");
        realSubject.Request();
    }
}
