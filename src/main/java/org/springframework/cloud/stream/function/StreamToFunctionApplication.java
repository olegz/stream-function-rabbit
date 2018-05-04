package org.springframework.cloud.stream.function;

import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

@SpringBootApplication
public class StreamToFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StreamToFunctionApplication.class, args);
	}

//	@Bean
//	public Function<Message<?>, Message<?>> foo() {
//		return (x) -> {
//			System.out.println("In Function1: " + x);
//			return x;
//		};
//	}

	@Bean
	public Consumer<Message<?>> foo() {
		return (x) -> {
			System.out.println("In Function1: " + x);
		};
	}
}
