package chapter16;

import javafx.stage.StageStyle;

public class Context {
    private State state;

    private int value;

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        //其他代码
        state.handle();//调用状态对象业务方法
        //其他代码
    }
}