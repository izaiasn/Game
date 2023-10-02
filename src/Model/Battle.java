package Model;

import java.util.Scanner;

public class Battle {

    String senarioBatalha;
    Scanner scanner = new Scanner(System.in);

    public void iniciarBatalha(Player player, Enemy enemy){

        boolean continuar = true;

        while (continuar){

            int vidaPlayer = player.getVida();
            int vidaEnemy = enemy.getVida();

            if( enemy.vida <=0) {
                System.out.println("O Player " + player.getNome() + " é o vencedor");

                break;

            }else if (vidaPlayer<= 0){
                System.out.println("O Inimigo " + enemy.getNome() + " é o vencedor" );

                break;
            }

            System.out.println("/------------- Batalha -------------");
            System.out.println("Ataque Player  [ V ]" + player.getNome() + " Vida " + vidaPlayer);
            System.out.println("Ataque inimigo [ A ]" + enemy.getNome() + " Vida " + vidaEnemy);
            System.out.println("/-----------------------------------");

            String attack  = scanner.nextLine();
            if (attack.equalsIgnoreCase("V")){
                System.out.println("o player atacou");

                int danoPlayer = ((int) (Math.random()*20)+1);
                enemy.subtrairVida(danoPlayer);
                System.out.println("O dano gerado " +danoPlayer);

            }else if (attack.equalsIgnoreCase("A")){
                System.out.println("/------------- O Inimigo Atacou -------------");

                int danoEnemy = (int) (Math.random()*20 + 1);
                player.subtrairVida(danoEnemy);
                System.out.println("O dano gerado foi: "+ danoEnemy);

                System.out.println("/--------------------------------------------");



            }else {
                System.out.println("Digite uma tecla válida !!!");
            }

        }


    }

}
