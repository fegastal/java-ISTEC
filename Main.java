package com.company;

public class Main {

    public static void main(String[] args) {
        JogoDados zebatota = new JogoDados("Zé da Batota", 1000);
        zebatota.setOnIguais_Listener(new IOnIguais_Listener() {
            @Override
            public void OnIguais_handler(OnIguaisArgs args) {
                JogoDados sender = (JogoDados) args.getSource();
                int premio = sender.Dados[0]*2 * args.Aposta;
                sender.setMontante(sender.getMontante() + premio);
                System.out.println("Parabéns " + sender.getJogador() + " Ganhou " + premio + "em: " + args.Quando.toString());
            }
        });
        IJogo.publicidade("Royal"); //Static
        zebatota.cumprimento(); //Default
        zebatota.ver();
        for(int i=0; i<10; i++)zebatota.jogar(100);
    }
}
