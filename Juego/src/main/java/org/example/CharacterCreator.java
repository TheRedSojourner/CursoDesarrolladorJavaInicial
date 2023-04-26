package org.example;

import java.util.Random;
import java.util.Scanner;

public class CharacterCreator {

    private static CharacterCreator instance;
    private CharacterCreator() {}
    public static CharacterCreator getInstance()
    {
        if (instance == null) instance = new CharacterCreator();
        return instance;
    }

    public Jugador createMainCharacter()
    {
        Jugador player = new Jugador();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es su nombre, aventurero?");
        player.nombre = scanner.nextLine();
        System.out.println("Y a qué te dedicas?");
        System.out.println("1) Soy un poderoso guerrero!");
        System.out.println("2) Mi negocio es el de las sombras");
        System.out.println("3) Soy un erudito de las artes arcanas");

        scanner.reset();
        int n = scanner.nextInt();

        switch (n)
        {
            case 1:
                player.hp = 10;
                player.atk = 5;
                player.mp = 1;
                player.entidadclase = ENTIDADCLASE.FIGHTER;
                break;
            case 2:
                player.hp = 8;
                player.atk = 7;
                player.mp = 3;
                player.entidadclase = ENTIDADCLASE.ROGUE;
                break;
            case 3:
                player.hp = 6;
                player.atk = 3;
                player.mp = 10;
                player.entidadclase = ENTIDADCLASE.WIZARD;
                break;
        }
        return player;
    }

    public Enemigo createRandomEnemy()
    {
        Enemigo enemy = new Enemigo();
        enemy.nombre = "Antagonista";
        enemy.atk = 5;
        enemy.hp = 10;
        enemy.mp = 3;
        enemy.entidadclase = ENTIDADCLASE.FIGHTER;

        return  enemy;
    }

}
