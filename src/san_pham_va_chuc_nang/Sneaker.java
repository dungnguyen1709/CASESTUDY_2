package san_pham_va_chuc_nang;

import java.io.Serializable;

public class Sneaker implements Serializable {
    private int id;
    private String name;
    private int amount;
    private int price;
    private String brand;

    public Sneaker() {
    }

    public Sneaker(int id, String name, int amount, int price, String brand) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Sneaker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
