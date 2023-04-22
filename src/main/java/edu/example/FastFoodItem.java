package edu.example;

public class FastFoodItem {
    private String name;
    private String type;
    private double price;
    private String rating;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public FastFoodItem(String name, String type, double price, String rating) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }
    public String toString() {
        return "FastFoodItem{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", rating='" + rating + '\'' +
                '}';
    }
    


}
