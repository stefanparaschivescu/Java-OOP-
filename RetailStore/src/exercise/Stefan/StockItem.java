package exercise.Stefan;

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedItems;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reservedItems = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
        this.reservedItems = 0;
    }

    public int getReservedItems() {
        return reservedItems;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int reserveStock(int quantity) {
        if (this.reservedItems + quantity <= this.quantityStock && quantity > 0) {
            this.reservedItems += quantity;
            return quantity;
        }
        else
            System.out.println("You can't reserve more items than the stock. Stock available to reserve for " + this.name + ": " + (this.quantityStock - this.reservedItems));
        return 0;
    }

    public int unreserveStock(int quantity) {
        if (quantity <= this.reservedItems && quantity > 0) {
            this.reservedItems -= quantity;
            return quantity;
        }
        else
            System.out.println("You can't unreserve more items than the number you reserved. Number of items " + this.name + " left for unreservation: " + this.reservedItems);
        return 0;
    }

    public void adjustStock(int quantity) {
        if(this.quantityStock + quantity >=0)
            this.quantityStock = this.quantityStock + quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}
