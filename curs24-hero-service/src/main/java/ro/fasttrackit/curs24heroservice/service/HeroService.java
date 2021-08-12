package ro.fasttrackit.curs24heroservice.service;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs24heroservice.domain.Hero;
import ro.fasttrackit.curs24heroservice.persistence.HeroRepository;

import java.util.List;

@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public List<Hero> getAll(){
        return heroRepository.findAll();
    }

    public Hero addHero(Hero hero) {
        return heroRepository.save(hero);
    }
}
