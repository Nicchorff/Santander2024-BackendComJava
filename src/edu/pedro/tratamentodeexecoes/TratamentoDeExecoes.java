package edu.pedro.tratamentodeexecoes;

public class TratamentoDeExecoes {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("28910291");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        return "Exemplo de cep 29102010";
    }
}
