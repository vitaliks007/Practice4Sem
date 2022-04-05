package ru.vitaliy.task11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Task11Application {

	public static void main(String[] args) {
		SpringApplication.run(Task11Application.class, args);

		HelloController helloController = new HelloController();
		helloController.printHW();
	}
}
