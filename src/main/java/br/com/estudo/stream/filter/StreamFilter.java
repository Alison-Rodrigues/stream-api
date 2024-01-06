package br.com.estudo.stream.filter;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StreamFilter {

    //stream.filter() serve para filtrar elementos de um Array

    private List<String> names = Arrays.asList("Alison Rodrigues", "Enzo Rodrigues", "Vithor Rodrigues", "Paulo Rodrigues", "Tatiane Rodrigues",
            "Maria Heloisa Trevizzo", "Maria Julia Trevizzo", "Luiz Henrique Trevizzo", "Milza Trevizzo");

    private List<String> campaigns = Arrays.asList("000C260CID0001OrderCampaign123", "000C260CID0001OrderCampaign124", "000C260CID0001ReloadCampaign125",
            "000C260CID0002ConfirmationCampaign123", "C260CID0002AutomationCampaign1", "C260CID0002AutomationCampaign2", "C260CID0001AutomationCampaign1");

    public void executeFilter() {

        //elementos que contém a string "Rodrigues"
        List<String> resultRodrigues = names
                .stream()
                .filter(s -> s.contains("Rodrigues"))
                .collect(Collectors.toList());

        //elementos que contém a string "Trevizzo"
        List<String> resultTrevizzo = names
                .stream()
                .filter(s -> s.contains("Trevizzo"))
                .collect(Collectors.toList());

        //elementos que não começam com "000"
        List<String> without000 = campaigns
                .stream()
                .filter(s -> !s.startsWith("000"))
                .collect(Collectors.toList());

        //elementos que começam com "000"
        List<String> with000 = campaigns
                .stream()
                .filter(s -> s.startsWith("000"))
                .collect(Collectors.toList());

        //elementos que não começam com "000" e contém a string "CID0001"
        List<String> without000ContainsCID0001 = campaigns
                .stream()
                .filter(s -> !s.startsWith("000") && s.contains("CID0001"))
                .collect(Collectors.toList());

        System.out.println("\n########### STREAM FILTER #############");

        System.out.println("Full array NAMES: " + names);

        System.out.println("########## contains Rodrigues ###########");
        System.out.println(resultRodrigues);

        System.out.println("########## contains Trevizzo ###########");
        System.out.println(resultTrevizzo);

        System.out.println("\nFull Array CAMPAIGNS: " + campaigns);

        System.out.println("########## without start with 000 ###########");
        System.out.println(without000);
        System.out.println("########## start with 000 ##########");
        System.out.println(with000);
        System.out.println("########## without start with 000 and contains CID0001");
        System.out.println(without000ContainsCID0001);
    }
}
