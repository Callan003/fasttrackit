package ro.fasttrackit.curs24heroservice.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.fasttrackit.curs24heroservice.domain.Hero;

public interface HeroRepository extends JpaRepository<Hero, Integer> {
}
