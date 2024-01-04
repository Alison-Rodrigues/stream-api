package br.com.estudo.stream.filter;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StreamFilter {

    private List<String> names = Arrays.asList("Alison Rodrigues", "Enzo Rodrigues", "Vithor Rodrigues", "Paulo Rodrigues", "Tatiane Rodrigues",
            "Maria Heloisa Trevizzo", "Maria Julia Trevizzo", "Luiz Henrique Trevizzo", "Milza Trevizzo");

    public void executeFilter() {

        List<String> resultRodrigues = names
                .stream()
                .filter(s -> s.contains("Rodrigues"))
                .collect(Collectors.toList());

        List<String> resultTrevizzo = names
                .stream()
                .filter(s -> s.contains("Trevizzo"))
                .collect(Collectors.toList());

        System.out.println("\n########### STREAM FILTER #############");

        System.out.println("Full array: " + names);

        System.out.println("########## contains Rodrigues ###########");
        System.out.println(resultRodrigues);

        System.out.println("########## contains Trevizzo ###########");
        System.out.println(resultTrevizzo);
    }
}
