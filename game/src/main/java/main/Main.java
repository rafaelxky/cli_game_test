package main;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Shop.registerPlayer(player);
        while (true) {
            Round.buyPhase(player);
            Round.wavePhase(player);
        }
    }
}
