package main.items;

import main.Item;

public class ExitItem implements Item {
    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public void shopPrint() {
        System.out.println("exit");
    }

    @Override
    public boolean isInfiniteInShop() {
        return true;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
