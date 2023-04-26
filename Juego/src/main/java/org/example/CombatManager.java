package org.example;

import java.util.Random;
import java.util.Scanner;

public class CombatManager {
    private static CombatManager instance;
    private CombatManager() {}

    public static CombatManager getInstance()
    {
        if (instance == null) instance = new CombatManager();
        return instance;
    }

    public void iniciarCombate(Jugador player, Enemigo enemy)
    {
        int ronda = 1;
        while (player.hp> 0 && enemy.hp > 0)
        {
            System.out.println("Round "+ronda+". FIGHT.");
            reportarStats(player);
            decidirSiguienteAccion(enemy);
            decidirAccionJugador(player);
            resolveCombat(player, enemy, ronda);
            ronda++;
            if (enemy.hp <= 0)
            {
                System.out.println("PLAYER WINS");
            }
            else if (player.hp <= 0)
            {
                System.out.println("MONSTER WINS");
            }
        }
    }

    public void reportarStats(Jugador player)
    {
        System.out.println("HP: "+player.hp+"\n" +
                "MP: "+player.mp+"\n"+
                "ATK:"+player.atk);
    }
    private void resolveCombat(Jugador player, Enemigo enemy, int ronda)
    {
        if (ronda%2 == 1)
        {
            resolveDamage(enemy, player);
            resolveDamage(player, enemy);
        } else
        {
            resolveDamage(player, enemy);
            resolveDamage(enemy, player);
        }
    }

    private void resolveDamage(Entidad agresor, Entidad defensor)
    {
        switch (agresor.entidadestado)
        {
            case ATACANDO:
                if (defensor.entidadestado == ENTIDADESTADO.DEFENDIENDO)
                {
                    defensor.hp -= agresor.atk/2;
                } else
                {
                    defensor.hp -= agresor.atk;
                }
            case CASTEANDO:
                defensor.hp -= agresor.atk*2;
                agresor.mp--;
        }
    }
    private void decidirSiguienteAccion(Enemigo enemy)
    {
        Random r = new Random();
        int randy = 0;
        if (enemy.mp <= 0)
        {
            randy = r.nextInt(1, 3);
        } else
        {
            randy = r.nextInt(1, 4);
        }


        switch (randy)
        {
            case 1:
                enemy.defend();
            break;
            case 2:
                enemy.attack();
                break;
            case 3:
                enemy.cast();
                break;
        }
    }

    private void decidirAccionJugador(Jugador player)
    {
        Scanner scanner = new Scanner(System.in);

        boolean valid = false;
        while (valid == false)
        {
            System.out.println("Estas peleando por tu vida!");
            System.out.println("1) Atacar!");
            System.out.println("2) Bloquear");
            if (player.mp > 0)
            {
                System.out.println("3) Castear");
            }

            int n = scanner.nextInt();
            switch (n)
            {
                case 1:
                    player.attack();
                    valid = true;
                    break;
                case 2:
                    player.defend();
                    valid = true;
                    break;
                case 3:

                    if (player.mp <= 0)
                    {
                        System.out.println("No tienes suficiente energia!");
                        valid = false;
                    } else
                    {
                        player.cast();
                        valid = true;
                    }
                    break;
                default:
                    player.defend();
                    valid = true;
                    break;
            }
        }
    }


}
