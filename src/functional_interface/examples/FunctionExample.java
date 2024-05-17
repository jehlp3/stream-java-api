package src.functional_interface.examples;

//Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
//É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Criando lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //Usando a Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = numero -> numero*2;

        //Usando a função para dobrar todos os números no Stram e armazená-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(n -> n*2)
                .toList();

        //Imprimir a lista
        numerosDobrados.forEach(System.out::println);
    }

}
