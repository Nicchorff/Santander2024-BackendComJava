package edu.pedro.estruturacondicional;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int numero = 3;

        switch (numero){
            case 1:{
                System.out.println(numero);
                break;
            }
            case 2:{
                System.out.println("Selecionou o numero DOIS");
                break;
            }
            default:
                System.out.println("Undefined");

        }*/
        analisarCandidato(sc.nextDouble());

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        var result = salarioBase > salarioPretendido ? "Ligar para candidato" : salarioBase == salarioPretendido ? "Ligar para candidato com contra proposta" : "Aguardando o resultado dos outros candidatos";
        System.out.println(result);

        }
    }

