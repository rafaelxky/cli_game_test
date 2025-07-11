package main.enemies;

public class RegularEnemy extends Enemy{
    public RegularEnemy() {
        super(100, 10);
    }
    public String getName(){
        return "regular enemy";
    }
    public String getTop(){
        return "(-------------------\\/-------------------)";
    }
    public String getBottom(){
        return "(-------------------/\\-------------------)";
    }
}
