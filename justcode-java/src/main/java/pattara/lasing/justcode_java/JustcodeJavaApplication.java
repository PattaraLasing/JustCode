package pattara.lasing.justcode_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pattara.lasing.justcode_java.playground.Playground;
import pattara.lasing.justcode_java.playground.PlaygroundImpl;

@SpringBootApplication
public class JustcodeJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JustcodeJavaApplication.class, args);

		Playground playground = new PlaygroundImpl();

		//Saying hello welcome
		String welcome = playground.getMyWelcome();
		String hello = "Say Hello to potato :D ";
		System.out.println(welcome + " " + hello);

		//Anagrammes 
		boolean anagrammes1 = playground.anagrammes("hello", "ollhe");
		boolean anagrammes2 = playground.anagrammes("hello", "welcome");
		System.out.println("anagrammes1 : " + anagrammes1);
		System.out.println("anagrammes2 : " + anagrammes2);

		//Doublons
		
	}

}
