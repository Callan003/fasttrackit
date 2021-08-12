package ro.fasttrackit.curs24heroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.fasttrackit.curs24heroservice.domain.Hero;
import ro.fasttrackit.curs24heroservice.persistence.HeroRepository;

import java.util.List;

@SpringBootApplication
public class Curs24HeroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs24HeroServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(HeroRepository repository){
		return args -> {
			repository.saveAll(List.of(
					new Hero("Hercule", 9, 100, 0),
					new Hero("Gerbil-Man99", 5, 88, 0),
					new Hero("Erou", 6, 55, 0),
					new Hero("SuperErouL", 2, 51, 0),
					new Hero("Hades", 7, 80, 0)));
		};
	}
}
