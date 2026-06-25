package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
            }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice() * (1-item.getDiscount());
        }
        return total;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double total = 0.0;
        for (Food item : items) {
            if (item.getVegetarian())
                total += item.getAmount() * item.getPrice();
        }
        return total;
    }
}

