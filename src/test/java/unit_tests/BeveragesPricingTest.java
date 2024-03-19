package unit_tests;

import beverages.*;
import beverages.supplements.Cinnamon;
import beverages.supplements.Cream;
import beverages.supplements.Milk;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

import java.util.ArrayList;
import java.util.List;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        Tea teaWithMilk = new Tea(new Milk());
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        Coffee coffeeWithMilk = new Coffee(new Milk());
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        List<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Milk());
        supplements.add(new Cream());
        Coffee coffeeWithMilkAndCream = new Coffee(supplements);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        List<Supplement> supplements = new ArrayList<Supplement>();
        supplements.add(new Milk());
        supplements.add(new Cinnamon());
        Coffee coffeeWithMilkAndCream = new Coffee(supplements);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.35, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        HotChocolate hotChocolateWithCream = new HotChocolate(new Cream());
        assertThat(hotChocolateWithCream.price(),  is(closeTo(1.60, 0.001)));
    }
}
