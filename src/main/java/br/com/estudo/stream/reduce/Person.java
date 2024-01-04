package br.com.estudo.stream.reduce;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {
    private String name;
    private Integer age;
}
