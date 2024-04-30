package edu.pedro.estruturacondicional;
import java.util.*;

public class SwitchCase {
    public static void main(String[] args) {
        String [] candidatos = {"Pedro", "Lais", "Victor", "Cristina", "Harry", "Salua", "Leticia", "Miguel"};

        selecaoCandidato(candidatos);
    }

    static void selecaoCandidato(String [] candidatos){
        List<String> selecionados = new ArrayList<>();
        var candidatosSelecionados = 0;
        var candidatoAtual = 0;
        var salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            var salarioCandidato = gerarSalario();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salario " + String.format("%.2f",salarioCandidato));
            if(salarioBase >= salarioCandidato){
                candidatosSelecionados++;
                selecionados.add(candidato);
            }
            candidatoAtual++;
        }
        System.out.println("Total de candidatos Selecionados: " + candidatosSelecionados);
        infoCandidatoSelecionado(selecionados);
        for(String selecionado : selecionados){
            fazerLigacao(selecionado);
        }
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

    static void fazerLigacao(String candidato){
        int tentavaRealizda = 0;
        var continuarTentando = true;
        var atendeu = false;

        do{
            atendeu = simularAtender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentavaRealizda++;
            }
        }while (continuarTentando && tentavaRealizda < 3);
        var result = atendeu ? "Conseguimos contato com " + candidato + " na " + tentavaRealizda +" ligacao": "Não Conseguimos contato com " + candidato + " tentaiva maxima de ligacao de " + tentavaRealizda + " realizadas";
        System.out.println(result);

    }

    static boolean simularAtender(){
        Random rdm = new Random();
        return rdm.nextInt(3) == 1;
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        var result = salarioBase > salarioPretendido ? "Ligar para candidato" : salarioBase == salarioPretendido ? "Ligar para candidato com contra proposta" : "Aguardando o resultado dos outros candidatos";
        System.out.println(result);

        }
    }

