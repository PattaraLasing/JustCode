package pattara.lasing.justcode_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JustcodeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustcodeJavaApplication.class, args);

		String hello = "Say Hello to potato :D ";

		PlaygroundImpl text = new PlaygroundImpl(hello);

		System.out.println(text.getMyInput() + " welcome to the Playground follow me ~~~~");

	}

}
