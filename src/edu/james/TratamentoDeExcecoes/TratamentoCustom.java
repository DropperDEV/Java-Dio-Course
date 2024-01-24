package edu.james.TratamentoDeExcecoes;

public class TratamentoCustom {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep(("2376506"));
        } catch (CepInvalidoExcepetion e) {
            System.out.println("Valor do Cep deve ser 8 digitos");
        }

    }
    private static String formatarCep(String cep) throws CepInvalidoExcepetion{
        if(cep.length() < 8) throw new CepInvalidoExcepetion();
        return "23.765-064";
    }
}
