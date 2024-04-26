package edu.pedro.metodos;

public class Metodos {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.print("Qual o status da tv?\n" + smartTv.ligada);
        smartTv.LigarTv();
        System.out.println();

        System.out.print("Alexa ligar TV\nAgora TV está " + smartTv.ligada );
        smartTv.DesligarTv();
        System.out.println();

        System.out.print("Alexa desligar TV\nAgora TV está " + smartTv.ligada );
        System.out.println();

        System.out.print("Qual o volume da tv?\n" + smartTv.volume);
        System.out.println();

        System.out.print("Alexa aumentar mais 5 volume da TV");
        smartTv.aumentarVolume(5);
        System.out.println();

        System.out.print("Volume da TV agora é de " + smartTv.volume);
        System.out.println();

        System.out.print("Alexa diminuir menos 20 volume da TV");
        smartTv.diminuirVolume(20);
        System.out.println();

        System.out.print("Volume da TV agora é de " + smartTv.volume);
        System.out.println();



    }

}
