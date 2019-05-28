package simpleFactoryPattern.calculator;

import java.util.Scanner;

public class Caculator {
    public static void main(String[] args) {
        int numberA, numberB;
        String operate;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double result = 0;
        while (sc.hasNext()) {
            numberA = sc.nextInt();
            System.out.println("请输入运算符O：");
            operate = sc.next();
            System.out.println("请输入数字B：");
            numberB = sc.nextInt();

            Operation operation = OperationFactory.createOperate(operate);
            operation.numberA = numberA;
            operation.numberB = numberB;
            result = operation.getResult();

            System.out.println("结果是：" + result);
            System.out.println();
            System.out.println("请输入数字A：");
        }


    }
}
