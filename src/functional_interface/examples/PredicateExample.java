package src.functional_interface.examples;

//Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
//É comumente usada para filtrar os elementos do Stream com base em alguma condição.

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        //Criando lista de palavras
        List<String> palavras = Arrays.asList("Java","Kotlin","Python","JavaScript","C++","Go","Ruby");

        //Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //Usar Stream para filtrar as palavras com mais de 5 caracteres e imprimir
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
