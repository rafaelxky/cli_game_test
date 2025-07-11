package main;

import main.enemies.Enemy;
import main.enemies.EnemyInterface;
import main.items.Weapon;

import java.util.ArrayList;

public class Player {
    public int health;
    public int damage;
    public int money = 0;
    public static final int SLEEP_DURATION = 2000;

     public ArrayList<Items> inventory = new ArrayList<>();

    public Player(){
        this.health = 100;
        this.damage = 25;
        this.money = 10;
    }

    public boolean addItem(Items item){
        if (item == Items.EXIT){
            return false;
        }
        if (item.getItem() instanceof Weapon weapon && weapon.getDamage() > this.getDamage()){
            this.setDamage(weapon.getDamage());
        }
        inventory.add(item);
        return true;
    }

    public void attack(Enemy enemy){
        System.out.println(Decorations.PLAYER.top);
        System.out.println("You dealt " + this.getDamage() + " damage to " + enemy.getName());
        enemy.setHealth(enemy.getHealth() - this.damage);
        System.out.println("Enemy is now at " + enemy.getHealth() + " hp");
        System.out.println(Decorations.PLAYER.bottom);
    }

    public void takeDamage(Enemy enemy){
        System.out.println(enemy.getTop());
        System.out.println(enemy.getName() + " dealt " + enemy.getDamage() + " damage to you");
        this.health -= enemy.getDamage();
        System.out.println("You are now at " + this.getHealth() + " hp");
        System.out.println(enemy.getBottom());
    }

    public boolean fight(Enemy enemy){
        try {

        while (true) {
            Thread.sleep(SLEEP_DURATION);
            attack(enemy);
            if (enemy.isDead()){
                Thread.sleep(SLEEP_DURATION);
                System.out.println("You killed an enemy");
                return true;
            }
            Thread.sleep(SLEEP_DURATION);
            takeDamage(enemy);
            if (this.isDead()){
                Thread.sleep(SLEEP_DURATION);
                System.out.println("You died");
                return false;
            }
        }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isDead(){
        return health <= 0;
    }

    public void printStats(){
        System.out.println("Stats:");
        System.out.println("Health - " + getHealth());
        System.out.println("Damage - " + getDamage());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Items> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Items> inventory) {
        this.inventory = inventory;
    }
}
