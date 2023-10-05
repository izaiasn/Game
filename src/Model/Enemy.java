package Model;

import java.util.Scanner;

public class Enemy {

    Scanner teclado = new Scanner(System.in);
    String nome, skin;
    int vida = 100;

    public void cadastrarInimigo(){

        System.out.println("/------------- Cadastro Inimigo -------------");
        System.out.println("Infome o nome do Inimigo: ");
        nome = teclado.nextLine();
        System.out.println("Informe a Skin do Inimigo: ");
        skin = teclado.nextLine();
        System.out.println("/-------------------------------------------");

    }

    public void subtrairVida(int danoPlayer){
        this.vida -= danoPlayer;

        if(this.vida < 0){
            this.vida = 0;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
