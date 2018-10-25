package chapter01.v2;

public class Operationdiv extends Operation {
    @Override
    public double getResult() {
        double result = 0 ;
        if(numberB == 0) {
            System.out.println("除数不能为0");
            return result;
        }
        result = numberA / numberB;
        return result;
    }
}
