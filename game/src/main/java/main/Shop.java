package main;

import main.items.ExitItem;
import main.items.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static ArrayList<Items> items = Items.getList();
    public static ArrayList<Player> playerList = new ArrayList<>();

    public static void registerPlayer(Player player){
        playerList.add(player);
    }

    public static void printItems(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + " - " + items.get(i).getName());
        }
    }

    public static void printShop(){
        System.out.println("Shop");
        System.out.println(Decorations.SHOP.top);
        System.out.println(playerList.get(0).getMoney() + "$ ");
        Items.printAll();
        System.out.println(Decorations.SHOP.bottom);
    }

    public static Items buyItem(int index){
        if (items.get(index).getItem() instanceof ExitItem || index >= items.size() - 1){
            return Items.EXIT;
        }
        Items item = items.get(index);

        if (playerList.get(0).money < item.getItem().getPrice()){
            System.out.println("You don't have enough money to buy this item");
            return Items.NULL;
        }

        playerList.get(0).money -= item.getItem().getPrice();
        System.out.println("You bough " + item.getName() + ".");

        if (!item.getItem().isInfiniteInShop()){
            items.remove(index);
        }
        return item;
    }
}
