package src.functional_interface.examples;


//O objetivo da classe Optional no Java é fornecer uma abordagem mais segura e expressiva para tratar casos em que um valor
// pode ser ausente (nulo). Evitar o temido NullPointerException (NPE) que é comum quando se trabalha com referências nulas.
// Optional permite encapsular um valor que pode ser nulo dentro de um objeto Optional. Isso indica explicitamente que o valor
// pode ou não estar presente e requer que o código que deseja acessá-lo faça uma verificação explícita.


import java.util.Optional;

public class classeOptional {
    public static void main(String[] args) {

        //isPresent(): Verifica se o Optional contém um valor não nulo.
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.isPresent());

        //isEmpty() (A partir do Java 11): Verifica se o Optional está vazio (não contém um valor não nulo).
        Optional<String> optionalValue1 = Optional.ofNullable(null); //null = true, "teste" = false
        System.out.println(optionalValue1.isEmpty());

        //orElse(defaultValue): Obtém o valor contido no Optional, ou retorna um valor padrão se o Optional estiver vazio
        Optional<String> optionalValue2 = Optional.ofNullable(null);
        String result = optionalValue2.orElse("Default");
        System.out.println(result);

        //...
    }
}
