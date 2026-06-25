import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5, 100.0);
        var redApple = new Apple(10, 50.0, Colour.RED);
        var greenApple = new Apple(8, 60.0, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount() + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPriceWithoutDiscount() + " руб.");
    }
}
