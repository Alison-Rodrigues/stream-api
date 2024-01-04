package br.com.estudo.stream.reduce;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class StreamReduce {

    //Stream.reduce() reduz uma operação em um array a uma única saída

    //A operação Stream.reduce() é composta pela identidade, acumulador e combinador
    //identidade -> é o valor inicial da operação de redução.
    //acumulador -> é o valor que vai ser acumulado com o próximo elemento
    //combinador -> é a combinação entre o acumulador e o elemento

    //em outras palavras, temos: 0 + 1 + 2 + 3 + 4 + 5 + 6 = 21

    public void executeReduce() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> words = Arrays.asList("Hello!", " My", " name", " is", " Alison");

        int result1 = numbers
                .stream()
                        .reduce(0, (subtotal, element) -> subtotal + element);

        int result2 = numbers
                .stream()
                        .reduce(0, (Integer::sum));

        String result3 = words
                .stream()
                        .reduce("", (partialString, fullString) -> partialString + fullString);

        String result4 = words
                .stream()
                        .reduce("", (String::concat));


        System.out.println("########## (Integer) reduce with arrow function ###########");
        System.out.println(result1);
        System.out.println("########## (Integer) reduce with lambda ###########");
        System.out.println(result2);
        System.out.println("########## (String) reduce with arrow function ###########");
        System.out.println(result3);
        System.out.println("########## (String) reduce with lambda ###########");
        System.out.println(result4);

    }
}
