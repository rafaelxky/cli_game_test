package main.items;

public class Weapon implements WeaponInterface{
    public int damage;
    public String name;
    public int price;
    public boolean isInfiniteInShop = false;

    public Weapon(String name, int damage, int price){
        this.damage = damage;
        this.name = name;
        this.price = price;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getDamage(){
        return this.damage;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public void shopPrint() {
        System.out.println(name + " - damage: " + damage);
    }

    @Override
    public boolean isInfiniteInShop() {
        return isInfiniteInShop;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    public Weapon setInfiniteInShop(){
        isInfiniteInShop = true;
        return this;
    }
}
