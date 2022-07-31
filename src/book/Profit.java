package book;

public class Profit {
    private int count;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Profit(int count, double price){
        this.count = count;
        this.price = price;
    }

    @Override
    public String toString() {
        return " all books "+count+" books of the sum "+ price;
    }
}
