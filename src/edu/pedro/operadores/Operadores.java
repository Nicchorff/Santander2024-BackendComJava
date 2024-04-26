package edu.pedro.operadores;

public class Operadores
{
    public static void main(String[] args)
    {
        var nota1 = 7;
        var nota2 = 2;
        var media = (nota1 + nota2) / 2;

        var resultado = media > 7 ?"Aprovado" :"Reprovado";

        //Mesma coisa que

        if(media > 7)
        {
            resultado = "Aprovado";
        }
        else
        {
            resultado = "Reprovado";
        }

    }
}
