package src.functional_interface.examples;


//    Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
//    É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos
//    do Stream sem modificar, ou retornar um valor.

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Criando uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumerosPares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };
        numeros.stream()
                .filter(n -> n % 2 == 0) //filter é Predicate
                .forEach(System.out::println);
    }


}
