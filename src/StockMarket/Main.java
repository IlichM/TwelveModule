package StockMarket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount();
        stockAccount.start();
        long profit = 0;
        Scanner in = new Scanner(System.in);
        String command = "";
        while(!command.equals("exit")) {
            command = in.next();
            switch (command) {
                case "chek":
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    profit += (long)stockAccount.money - 10000;
                    System.out.println("Profit is " + profit);
                    stockAccount.money = 1000;
                    break;
            }
        }
    }
}
