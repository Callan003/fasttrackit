package ro.fasttrackit.curs23jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs23jpa.domain.Address;
import ro.fasttrackit.curs23jpa.domain.Person;
import ro.fasttrackit.curs23jpa.repository.PersonRepository;

@SpringBootApplication
public class Curs23jpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs23jpaApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(PersonRepository repo) {
		return args -> {
			repo.save(new Person("Maria", 18, new Address("Maciesului", 34)));
			repo.save(new Person("Ioana", 99, new Address("Maciesului", 36)));
			repo.save(new Person("Campioana", 42, new Address("Adevarului", 12)));
			repo.save(new Person("Mihai", 33, new Address("Onestilor", 99)));
			repo.save(new Person("Dorel", 42, new Address("Facliei", 41)));

			repo.findAll()
					.forEach(System.out::println);

			System.out.println("My querry: ");
			System.out.println(repo.myQuerry());

			System.out.println("My querry: ");
			System.out.println(repo.myQuerry(40));

			System.out.println(repo.findFirstByAgeGreaterThan(40));
		};
	}
}
