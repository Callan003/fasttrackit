package ro.fasttrackit.curs23jpa.services;

import org.springframework.stereotype.Service;
import ro.fasttrackit.curs23jpa.domain.Person;
import ro.fasttrackit.curs23jpa.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(final PersonRepository repository){
        this.repository = repository;
    }

    public List<Person> getAll(String name) {
        if(name == null) {
            return repository.findAll();
        } else {
            return repository.findByName(name);
        }
    }
}
