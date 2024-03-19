package beverages;

import java.util.List;

public class Coffee extends Beverage {

    public Coffee(){
        
    }

    public Coffee(Supplement supplement) {
        super(supplement);
    }

    public Coffee(List<Supplement> supplements) {
        super(supplements);
    }

    @Override
    public double basePrice() {
        return 1.2;
    }
}
