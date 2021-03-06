package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;


@SpringBootApplication
public class Cwiczenie1dodatkoweApplication {

	public static void main(String[] args) {

		SpringApplication.run(Cwiczenie1dodatkoweApplication.class, args);


		HashMap<String, Integer> familly = new HashMap<String, Integer>();

		familly.put("uncle sam", 99912222);
		familly.put("tom", 11122222);
		familly.put("harry", 12299933);


		String query[] = new String[3];
		query[0] = "uncle sam";
		query[1] = "uncle tom";
		query[2] = "harry";


		System.out.println("\nChecking connection between Query and HashMap:\n");


		for (int i = 0; i < query.length; i++) {
			String check = query[i];
			System.out.println("\nFor query position: \"" + check + "\" HashMap value is equal to: ");


			if (familly.containsKey(check))
			{
				System.out.println(familly.get(check));
			} else {
				System.out.println("not found");
			}



		}


	}
}

