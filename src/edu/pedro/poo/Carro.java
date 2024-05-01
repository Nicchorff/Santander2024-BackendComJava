package edu.pedro.poo;

public class Carro {
    public void ligar(){
        conferirCambio();
        conferirCombustivel();
        System.out.println("Ligando");
    }
    private void conferirCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void conferirCambio(){
        System.out.println("Conferindo Cambio");
    }
}
