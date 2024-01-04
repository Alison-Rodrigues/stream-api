package br.com.estudo.stream.reduce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
        List<Integer> age = new ArrayList<>();

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

        Person person1 = new Person();
        person1.setName("Alison");
        person1.setAge(22);

        Person person2 = new Person();
        person2.setName("Vithor");
        person2.setAge(14);

        Person person3 = new Person();
        person3.setName("Enzo");
        person3.setAge(9);

        Person person4 = new Person();
        person4.setName("Maria");
        person4.setAge(20);

        age.add(person1.getAge());
        age.add(person2.getAge());
        age.add(person3.getAge());
        age.add(person4.getAge());

        double sumAge = age
                .stream()
                        .reduce(0, (Integer::sum));

        double avg = sumAge / age.size();

        System.out.println("######### average using reduce ##########");
        System.out.println(avg);
    }
}
