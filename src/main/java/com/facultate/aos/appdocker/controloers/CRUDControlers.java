package com.facultate.aos.appdocker.controloers;

import com.facultate.aos.appdocker.model.Person;
import com.facultate.aos.appdocker.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CRUDControlers {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person) {
        return personRepository.save(person);
    }

    @RequestMapping(path = "/personDelete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deletePerson(@PathVariable(value = "id") Integer id) {
        Person auxPerson = personRepository.findById(id).get();
        if (auxPerson == null) {
            return ResponseEntity.badRequest().build();
        }
        personRepository.delete(auxPerson);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(path = "/updatePerson/{id}", method = RequestMethod.PUT)
    public ResponseEntity updatePerson(@PathVariable(value = "id") Integer id,
                                       @Valid @RequestBody Person person) {
        Person auxPerson = personRepository.findById(id).get();
        if (auxPerson == null) {
            return ResponseEntity.badRequest().build();
        }
        auxPerson.setFirstName(person.getFirstName());
        auxPerson.setLastName(person.getLastName());
        auxPerson.setAge(person.getAge());
        Person updatePerson = personRepository.save(auxPerson);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(path = "/seeAll", method = RequestMethod.GET)
    public List<Person> listPersons() {
        return (List<Person>) personRepository.findAll();
    }

}
