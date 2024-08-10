package Shop;

//use of classes can be seen here
public class Items {
    private String item;
    private double price;
    private double quantity;

    public Items(String item, double price, double quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;    //use of this pointer can be seen here
    }

    public String getName() {
        return item;
    }

    public void setName(String name) {
        this.item = name;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void displayInfo() {
        System.out.println("Item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}
