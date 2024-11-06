package tasks;

class Item {
    String name;
    String sku;
    double price;
    int quantity;
    String color;

    public Item(String name, String sku, double price, int quantity, String color) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.quantity = quantity;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Артикул: " + sku + ", Название: " + name + ", Цена: " + price + ", Количество: " + quantity + ", Цвет: " + color;
    }
}

public class task3 {
    public static void main(String[] args) {
        Item item1 = new Item("Телефон", "SKU12345", 30000, 5, "Черный");
        Item item2 = new Item("Ноутбук", "SKU12346", 70000, 3, "Серебристый");
        Item item3 = new Item("Часы", "SKU12347", 15000, 10, "Золотой");
        Item item4 = new Item("Телевизор", "SKU12348", 45000, 2, "Черный");
        Item item5 = new Item("Наушники", "SKU12349", 3000, 15, "Белый");

        Item[] items = { item1, item2, item3, item4, item5 };

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
