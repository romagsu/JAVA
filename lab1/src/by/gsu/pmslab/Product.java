package by.gsu.pmslab;

public class Product {

    private String name;
    private boolean stock;
    private int price;


    public Product (String name, boolean stock, int price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public Product(String name, int price){
        this(name,true,price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock){
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ";"+ stock + ";" + by.gsu.pmslab.Byn.toBYN(price);
    }

}
