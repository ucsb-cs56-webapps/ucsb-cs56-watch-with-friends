package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private BuildingCodeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of building codes
		repository.save(new BuildingCode("HFH", "Harold Frank Hall"));
		repository.save(new BuildingCode("PHELPS", "Phelps Hall"));

		// fetch all building codes
		
		System.out.println("Building Codes found with findAll():");
		System.out.println("-------------------------------");
		for (BuildingCode bc : repository.findAll()) {
			System.out.println(bc);
		}
		System.out.println();

		// fetch an individual code
		System.out.println("Building Code found with findByCode('HFH'):");
		System.out.println("--------------------------------");
		BuildingCode hfh = repository.findByCode("HFH");
		System.out.println("hfh=" + hfh);
		System.out.println("hfh.getCode()=" + hfh.getCode());
		System.out.println("hfh.getName()=" + hfh.getName());
	}

}
