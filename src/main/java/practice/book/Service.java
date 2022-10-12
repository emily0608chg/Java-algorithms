package practice.book;

public class Service {

    private int code;
    private int quantity;
    private double price;

    public Service(int code, int quantity, double price) {
        this.code = code;
        this.quantity = quantity;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
