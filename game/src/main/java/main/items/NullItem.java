package main.items;

import main.Item;

public class NullItem implements Item {
    @Override
    public String getName() {
        return "";
    }

    @Override
    public void shopPrint() {

    }

    @Override
    public boolean isInfiniteInShop() {
        return false;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
