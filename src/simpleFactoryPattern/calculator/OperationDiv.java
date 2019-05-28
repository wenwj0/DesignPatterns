package simpleFactoryPattern.calculator;

public class OperationDiv extends Operation{
    @Override
    public double getResult() {
        double result = 0;
        if(0==numberB){
            System.out.println("除数不能为零。");
            throw new RuntimeException("divided by zero");
        }
        result = numberA /numberB;
        return result;
    }
}
