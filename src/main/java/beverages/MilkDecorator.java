package beverages;

public class MilkDecorator extends SupplementDecorator {

  public MilkDecorator(Product component) {
    super(component);
  }

  private final double price = 0.1;

  @Override
  public double getPrice() {
    return this.price + this.component.getPrice();
  }
}
