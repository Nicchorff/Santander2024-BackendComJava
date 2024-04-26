package edu.pedro.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void LigarTv(){
        ligada = true;
    }

    public void DesligarTv(){
        ligada = false;
    }

    public void aumentarVolume(int quantidade){
        volume += quantidade;
    }

    public void diminuirVolume(int quantidade){
        volume -= quantidade;

    }
}
