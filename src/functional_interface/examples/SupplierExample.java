package src.functional_interface.examples;

//Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
//É comumente usada para criar ou fornecer novos objetos de um determinado tipo.

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Usar o Stream para obter uma lista com saudações iguais
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Imprimir
        listaSaudacoes.forEach(System.out::println);
    }
}
