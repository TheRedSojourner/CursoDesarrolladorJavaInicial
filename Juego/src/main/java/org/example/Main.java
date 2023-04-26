package org.example;

public class Main {
    public static void main(String[] args) {
        Jugador player = CharacterCreator.getInstance().createMainCharacter();
        Enemigo enemy = CharacterCreator.getInstance().createRandomEnemy();
        CombatManager.getInstance().iniciarCombate(player, enemy);



    }
}