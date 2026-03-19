package pattara.lasing.justcode_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pattara.lasing.justcode_java.playground.Playground;
import pattara.lasing.justcode_java.playground.PlaygroundImpl;

@SpringBootApplication
public class JustcodeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustcodeJavaApplication.class, args);

		String hello = "Say Hello to potato :D ";

		Playground playground = new PlaygroundImpl();
		String welcome = playground.getMyWelcome();

		System.out.print(welcome + " " + hello);

	}

}
