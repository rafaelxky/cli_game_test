package main;

import main.items.ExitItem;
import main.items.HealthItem;
import main.items.NullItem;
import main.items.Weapon;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Items {
    EXIT(new ExitItem()),
    SHORT_SWORD(new Weapon("short sword", 50, 50)),
    REGULAR_SWORD(new Weapon("regular sword", 75, 75)),
    LONG_SWORD(new Weapon("long sword", 100, 100)),
    HEALTH_POTION(new HealthItem("health potion", 100, 50).setInfiniteInShop()),
    NULL(new NullItem());

    public Item item;

    Items (Item item){
        this.item = item;
    }
    public String getName(){
        return this.item.getName();
    }
    public Item getItem(){
        return this.item;
    }
    public static void printAll(){
        int i = 0;
        for (Items item : Shop.items) {
            if (item.getItem() instanceof NullItem){
                continue;
            }
            System.out.print(i + " - ");
            if (item.getItem().getPrice() != 0) {
                System.out.print(item.getItem().getPrice() + "$ ");
            }
            item.getItem().shopPrint();
            i++;
        }
    }
    public static ArrayList<Items> getList(){
        return new ArrayList<>(Arrays.asList(Items.values()));
    }
}
