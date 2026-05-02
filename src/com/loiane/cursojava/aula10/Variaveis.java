package com.loiane.cursojava.aula10;

public class Variaveis {

    public static void main(String[] args) {

        //convenção Java
        int idade = 20;
        String nome = "Alex";
        String nomeDoMeuGato = "Cristiano";
        String ano2014 = "2014";

        //aceito, mas não utilizado
        int _idade;
        int $idade;


        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuGato;
        String nomeDoMeugato;

        idade = 25;

        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);

        // má prática <os nomes das variáveis tem que indicar de forma clara a sua funcionalidade>
        int a = 10;
        String b = "Loiane";
    }

}
