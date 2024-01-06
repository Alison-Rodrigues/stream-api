package br.com.estudo.stream.map;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class StreamMap {

    public void execute() {
        List<Staff> staffList = Arrays.asList(
                new Staff("Alison", 23, new BigDecimal(10000)),
                new Staff("Maria Heloisa", 20, new BigDecimal(20000)),
                new Staff("João Paulo", 34, new BigDecimal(23000)),
                new Staff("Maiki Salermo", 50, new BigDecimal(3000))
        );

        List<String> staffName = staffList
                .stream()
                .map(s -> s.getName())
                .collect(Collectors.toList());

        List<Integer> staffAgeGreaterThan20 = staffList
                .stream()
                .map(s -> s.getAge())
                .filter(s -> s > 20)
                .collect(Collectors.toList());

        List<Integer> staffAge = staffList
                .stream()
                .map(s -> s.getAge())
                .collect(Collectors.toList());

        int maxAge = staffList
                .stream()
                .map(s -> s.getAge())
                .reduce(0, (Integer::max));

        double sumAge = staffList
                .stream()
                .map(s -> s.getAge())
                .reduce(0, (Integer::sum));

        double avgAge = sumAge / staffAge.size();

        System.out.println("\n########### STREAM MAP ############");

        System.out.println("############ get only names ###########");
        System.out.println(staffName);

        System.out.println("########### get only age if greater than 20 ###########");
        System.out.println(staffAgeGreaterThan20);

        System.out.println("########## get the max age #############");
        System.out.println(maxAge);

        System.out.println("########## get the average from ages ############");
        System.out.println(avgAge);


    }


}
