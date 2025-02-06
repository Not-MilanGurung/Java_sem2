package week3.breo.practical;

public class Product {
    int productID, price, stockQuantity;
    String name;

    public Product(int productID, String name, int price, int stockQuantity){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void addStock(int quantity){
        if (quantity < 1) 
            System.err.println("Invalid quantity");
        else  
            this.stockQuantity += quantity;
    }

    public void purchaseProduct(int quantity){
        if (quantity > this.stockQuantity)
            System.err.println("Not enought products in stock");
        else
            this.stockQuantity -= quantity;
    }

    public void displayInfo(){
        System.out.println("Product Description:");
        System.out.println("ID: "+this.productID);
        System.out.println("Name: "+this.name);
        System.out.println("Price: "+this.price);
        System.out.println("Stock quantity: "+this.stockQuantity);
    }

    public static void main(String[] args) {
        Product p1 = new Product(1, "Shirt", 500, 137);
        p1.displayInfo();
        p1.purchaseProduct(45);
        p1.displayInfo();
        p1.addStock(50);
        p1.displayInfo();
        p1 = null;
        System.gc();
    }
}
