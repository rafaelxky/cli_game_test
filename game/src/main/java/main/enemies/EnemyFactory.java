package main.enemies;

import java.util.ArrayList;

public class EnemyFactory {
    public static ArrayList<Enemy> generateWave(int waveNumber){
        ArrayList<Enemy> wave = new ArrayList<>();
        for (int i = 0; i < waveNumber; i++){
            wave.add(randomEnemy());
        }
        return wave;
    }

    public static Enemy randomEnemy(){
        return new RegularEnemy();
    }
}
