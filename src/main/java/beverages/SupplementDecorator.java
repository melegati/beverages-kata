package beverages;

public abstract class SupplementDecorator implements Product{
  public SupplementDecorator(Product component) {
    this.component = component;
  }
  
  protected Product component;

  public abstract double getPrice();
}
