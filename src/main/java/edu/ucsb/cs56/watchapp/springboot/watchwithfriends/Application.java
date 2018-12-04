package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	@Autowired
	private WatchCodeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
/*	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of building codes
		repository.save(new WatchCode("youtube.com/link?=123", "random user", "12313131"));
		repository.save(new WatchCode("youtube.com/link?=321", "another user", "5556636"));

		// fetch all building codes
		
		System.out.println("These are the codes we found in DB");
		System.out.println("-------------------------------");
		for (WatchCode wc : repository.findAll()) {
			System.out.println(wc);
		}
		System.out.println();

		// fetch an individual code
		System.out.println("Watch Code found with findByLink():");
		System.out.println("--------------------------------");
		WatchCode lin = repository.findByLink("youtube.com/link?=123");
		System.out.println("link=" + lin);
		System.out.println("lin.getLink()=" + lin.getLink());
		System.out.println("lin.getName()=" + lin.getName());
		System.out.println("lin.getHash()-" + lin.getHash());
	}

	*/
	/* -------------- HASH JS FUNCTION ------------------
	 *
	 *
	 *

	 function getHash(str) {
             var hash = 0;
             for (var i = 0; i < str.length; i++) {
                 hash += str.charCodeAt(i);
             }
             hashStr = hash.toString(5);
             return hashStr.substring(0,6);
         }
	
	 *
	 *
	 */
}	
