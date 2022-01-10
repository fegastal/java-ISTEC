package com.company;

public interface IJogo {
    static final int MINAPOSTA=10;
    void setMontante(int montante);
    int getMontante();
    void jogar (int aposta);


    String getJogador();
    static void publicidade(String nome){
        System.out.println("Bem vindo ao casino " + nome);
    }

    default void cumprimento(){
        System.out.println("Boa Noite");
    }
}
