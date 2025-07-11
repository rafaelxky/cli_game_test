package main.items;

public class HealthItem implements Consumable{
    public int health;
    public boolean isInfiniteInShop = false;
    public int price;
    public String name;

    public HealthItem(String name,int health, int price){
        this.health = health;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void shopPrint() {
        System.out.println(this.getName() + " - health: " + health);
    }

    @Override
    public boolean isInfiniteInShop() {
        return isInfiniteInShop;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public HealthItem setInfiniteInShop(){
        isInfiniteInShop = true;
        return this;
    }

}
