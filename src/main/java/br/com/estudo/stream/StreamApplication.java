package br.com.estudo.stream;

import br.com.estudo.stream.filter.StreamFilter;
import br.com.estudo.stream.reduce.StreamReduce;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StreamApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StreamApplication.class, args);

		StreamReduce streamReduce = context.getBean(StreamReduce.class);
		streamReduce.executeReduce();

		StreamFilter streamFilter = context.getBean(StreamFilter.class);
		streamFilter.executeFilter();
	}

}
