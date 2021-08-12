package ro.fasttrackit.curs24heroservice.controller;


import org.springframework.web.bind.annotation.*;
import ro.fasttrackit.curs24heroservice.domain.Hero;
import ro.fasttrackit.curs24heroservice.service.HeroService;

import java.util.List;

@RestController
@RequestMapping("heroes")
public class HeroController {

    private final HeroService heroService;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping
    public List<Hero> getAll(){
        return this.heroService.getAll();
    }

    @PostMapping
    public Hero addHero(@RequestBody Hero hero){
        return heroService.addHero(hero);
    }
}
