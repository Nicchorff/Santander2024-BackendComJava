package edu.pedro.estruturacondicional;
import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        selecaoCandidato();

    }

    static void selecaoCandidato(){
        String [] candidatos = {"Pedro", "Lais", "Victor", "Cristina", "Harry", "Salua", "Leticia", "Miguel"};
        List<String> selecionados = new ArrayList<>();
        var candidatosSelecionados = 0;
        var candidatoAtual = 0;
        var salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            var salarioCandidato = gerarSalario();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salario " + salarioCandidato);
            if(salarioBase >= salarioCandidato){
                candidatosSelecionados++;
                selecionados.add(candidato);
            }
            candidatoAtual++;
        }
        System.out.println("Total de candidatos Selecionados: " + candidatosSelecionados);
        infoCandidatoSelecionado(selecionados);
    }

    static void infoCandidatoSelecionado(List<String> canditatosSelecionados){
        for(var i = 0; i < canditatosSelecionados.size(); i++){
            System.out.println(canditatosSelecionados.get(i) + " foi selecionado");
        }
    }

    static double gerarSalario(){
        Random rdm = new Random();
        return rdm.nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        var result = salarioBase > salarioPretendido ? "Ligar para candidato" : salarioBase == salarioPretendido ? "Ligar para candidato com contra proposta" : "Aguardando o resultado dos outros candidatos";
        System.out.println(result);

        }
    }

