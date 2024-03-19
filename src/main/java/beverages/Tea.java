package beverages;

public class Tea extends Beverage {
    
    private Supplement supplement;

    public Tea() {

    }
    
    public Tea(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double basePrice() {
        return 1.5;
    }
}
