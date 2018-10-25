package chapter01.v1;

import java.util.Scanner;

/**
 * 这种方法没有使用面向对象的思维
 * @author Administrator
 *
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("请输入数字A：");
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println("请输入运算符(+、-、*、/)：");
        String strOperate = sc.nextLine();
        System.out.println("请输入数字B：");
        String B = sc.nextLine();
        Double result = null;
        switch (strOperate) {
            case "+":
                result = (Double.parseDouble(A) + Double.parseDouble(B));
                break;
            case "-":
                result = (Double.parseDouble(A) - Double.parseDouble(B));
                break;
            case "*":
                result = (Double.parseDouble(A) * Double.parseDouble(B));
                break;
            case "/":
                result = (Double.parseDouble(A) / Double.parseDouble(B));
                break;                
        }
        
        System.out.println("结果是：" + result);
            
    }
}
