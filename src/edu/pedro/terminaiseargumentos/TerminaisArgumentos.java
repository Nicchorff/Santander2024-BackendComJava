package edu.pedro.terminaiseargumentos;

import java.util.Locale;
import java.util.Scanner;

public class TerminaisArgumentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual a nome?");
        String nome = sc.next();

        System.out.println("Qual a sobrenome?");
        String sobrenome = sc.next();

        System.out.println("Qual a idade?");
        int idade = sc.nextInt();

        System.out.println("Qual a altura?");
        double altura = sc.nextDouble();

        System.out.println(nome + " " + sobrenome + " " + idade + " " + altura);
    }
}
