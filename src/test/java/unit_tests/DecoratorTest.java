package unit_tests;

import beverages.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class DecoratorTest {
    @Test
    public void computes_coffee_price() {
        Product coffeeWithMilk = new MilkDecorator(new CoffeeProduct());
        assertThat(coffeeWithMilk.getPrice(), is(closeTo(1.30, 0.001)));
    }
}
