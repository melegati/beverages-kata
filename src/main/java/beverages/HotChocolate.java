package beverages;

public class HotChocolate extends Beverage {

    public HotChocolate() {

    }

    public HotChocolate(Supplement supplement) {
        super(supplement);
    }

    @Override
    public double basePrice() {
        return 1.45;
    }
}
