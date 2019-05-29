package strategy;

public interface Strategy {
    public void algorithmInterface();
}

class StrategyA implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("策略A的具体算法实现");
    }
}

class StrategyB implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("策略B的具体算法实现");
    }
}

class StrategyC implements Strategy{
    @Override
    public void algorithmInterface() {
        System.out.println("策略C的具体算法实现");
    }
}