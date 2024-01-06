package br.com.estudo.stream.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Staff {
    private String name;
    private Integer age;
    private BigDecimal salary;
}
