package edu.ucsb.cs56.watchapp.springboot.watchwithfriends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private WatchCodeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save links
		repository.save(new WatchCode("youtube.com/link?=123", "random user", "12313131"));
		repository.save(new WatchCode("youtube.com/link?=321", "another user", "5556636"));

		// fetch all links
		
		System.out.println("These are the codes we found in DB");
		System.out.println("-------------------------------");
		for (WatchCode wc : repository.findAll()) {
			System.out.println(wc);
		}
		System.out.println();

		// fetch an individual code
		System.out.println("Watch Code found with findByLink():");
		System.out.println("--------------------------------");
		WatchCode lin = repository.findByHash("5556636");
		System.out.println("link=" + lin);
		System.out.println("lin.getLink()=" + lin.getLink());
		System.out.println("lin.getName()=" + lin.getName());
		System.out.println("lin.getHash()-" + lin.getHash());
	}
}	
