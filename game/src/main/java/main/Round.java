package main;

import main.enemies.Enemy;
import main.enemies.EnemyFactory;

import java.util.ArrayList;

public class Round {
    public static int waveNumber = 1;

    public static void start(){
        // start buy phase
        // if buy phase is over
        // go to wave_phase
    }

    public static void buyPhase(Player player){
        while (true) {
            Shop.printShop();
            if (player.addItem(Shop.buyItem(Inputhandler.getUserInputInt()))) {
                continue;
            }
            return ;
        }
    }

    public static void wavePhase(Player player){
        player.printStats();
        System.out.println("Starting wave " + waveNumber);
        ArrayList<Enemy> enemyWave = EnemyFactory.generateWave(waveNumber);
        for (Enemy enemy : enemyWave){
            System.out.println("You encountered " + enemy.getName());
            if (!player.fight(enemy)) {
                gameOverPhase();
            }
        }
        player.money += getMoneyAmount();
        waveNumber++;
    }

    public static int getMoneyAmount(){
        return (int)(50);
    }

    public static void gameOverPhase(){
        System.out.println("You died, game over!");
        System.exit(0);
    }
}
