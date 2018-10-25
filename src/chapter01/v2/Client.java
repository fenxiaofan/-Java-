package chapter01.v2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
        System.out.println("请输入数字A：");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println("请输入运算符(+、-、*、/)：");
        String strOperate = sc.nextLine();
        System.out.println("请输入数字B：");
        String B = sc.nextLine();
        
        Operation operation ;
        operation = OperationFactory.createOperate(strOperate);
        operation.setNumberA(Double.parseDouble(A));
        operation.setNumberB(Double.parseDouble(B));
        double result = operation.getResult();
        System.out.println("结果是：" + result);
    }
}
