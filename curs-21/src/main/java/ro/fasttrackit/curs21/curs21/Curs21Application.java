package ro.fasttrackit.curs21.curs21;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Curs21Application {

	public static void main(String[] args) {
		SpringApplication.run(Curs21Application.class, args);
	}

	@Bean
	public CommandLineRunner runAtStartup(ApplicationContext context){
		return args -> {
			Car car = context.getBean(Car.class);
			System.out.println(car);
			car.start();
			System.out.println(car);
			Engine engine = context.getBean(Engine.class);
			System.out.println(engine);
		};
	}
}
