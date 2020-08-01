package exercise.Stefan;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket stefanBasket = new Basket("Stefan");
        stefanBasket.reserveItem(stockList, "car", 1);
        stefanBasket.reserveItem(stockList, "car", 1);
        stefanBasket.reserveItem(stockList, "car", 1);
        stefanBasket.reserveItem(stockList, "spanner", 5);
        stefanBasket.reserveItem(stockList, "juice", 4);
        stefanBasket.reserveItem(stockList, "cup", 12);
        stefanBasket.reserveItem(stockList, "bread", 1);
        stefanBasket.unreserveItem(stockList, "cup", 5);
        stefanBasket.unreserveItem(stockList, "cup", 4);
        stefanBasket.unreserveItem(stockList, "cup", 3);
        stefanBasket.unreserveItem(stockList, "cup", 1);
        stefanBasket.unreserveItem(stockList, "milk", 5);

        stefanBasket.checkOut(stockList);

        stefanBasket.reserveItem(stockList, "cake", 1);
        stefanBasket.reserveItem(stockList, "phone", 1);
        stefanBasket.reserveItem(stockList, "vase", 2);
        stefanBasket.unreserveItem(stockList, "vase", 1);

        stefanBasket.checkOut(stockList);

        //temp = new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }


    }


}
