package beverages;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {

    private List<Supplement> supplements;

    public Beverage() {
        this.supplements = new ArrayList<>();
    }

    public Beverage(Supplement supplement) {
        this.supplements = new ArrayList<>();
        this.supplements.add(supplement);
    }

    public Beverage(List<Supplement> supplements) {
        this.supplements = supplements;
    }

    public double price() {
        double sumSupplements = 0;
        for (Supplement supplement : supplements) {
            sumSupplements += supplement.price();
        }
        
        return basePrice() + sumSupplements;
    }

    public abstract double basePrice();
}
