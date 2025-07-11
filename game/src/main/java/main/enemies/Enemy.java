package main.enemies;

public abstract class Enemy implements EnemyInterface {

    public int health;
    public int damage;
    public Enemy(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public boolean isDead(){
        return this.health <= 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
