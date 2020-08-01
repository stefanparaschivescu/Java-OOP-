package exercise.Stefan;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new LinkedHashMap<>();
    }

    private void addToBasket(StockItem item, int quantity) {
        if ((item != null)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
        }
    }

    /*public int buyItem(StockList stockList, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            addToBasket(stockItem, quantity);
            return quantity;
        }
        else
            System.out.println("There is no stock left for item " + item);
        return 0;
    }*/

    public int reserveItem (StockList stockList, String item, int quantity) {

        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't have " + item + " for sale");
            return 0;
        }
        if (stockItem.reserveStock(quantity) != 0) {
            addToBasket(stockItem, quantity);
            System.out.println("You reserved " + item + ": " + quantity + " pieces");
            return quantity;
        }
        return 0;
    }

    public int unreserveItem (StockList stockList, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("You can't unreserve " + item + " as we don't sell it");
            return 0;
        }
        if (stockItem.unreserveStock(quantity) != 0) {
            addToBasket(stockItem, -quantity);
            System.out.println("You unreserved " + item + ": " + quantity + " pieces");
            if (list.get(stockItem) == 0)
                list.remove(stockItem);
            return quantity;
        }
        return 0;
    }

    public double checkOut (StockList stockList) {
        System.out.println("\nYou checked out. List of items you ordered");
        double totalPrice = 0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            item.getKey().adjustStock(-item.getKey().getReservedItems());
            System.out.println(item);
            totalPrice += item.getKey().getPrice() * item.getKey().getReservedItems();
        }
        System.out.println("Please pay " + totalPrice + "$");
        System.out.println(stockList + "\n");
        this.list.clear();
        return totalPrice;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ? " item" : " items") + "\n";
        double totalCost = 0.0;
        for (Map.Entry<StockItem, Integer> item : list.entrySet()) {
            s = s + item.getKey() + ". " + item.getValue() + " reserved\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "Total cost " + totalCost;
    }
}
