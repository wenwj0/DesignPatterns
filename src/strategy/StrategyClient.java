package strategy;

public class StrategyClient {
    public static void main(String[] args) {
        Context context;
        context = new Context(new StrategyA());
        context.contextInterface();

        context = new Context(new StrategyB());
        context.contextInterface();

        context = new Context(new StrategyC());
        context.contextInterface();
    }

}
