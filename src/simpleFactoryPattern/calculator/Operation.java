package simpleFactoryPattern.calculator;

public abstract class Operation {
    public double numberA = 0;
    public double numberB = 0;

    public abstract double getResult();
}
