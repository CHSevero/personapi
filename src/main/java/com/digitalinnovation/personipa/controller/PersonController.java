package com.digitalinnovation.personipa.controller;

import com.digitalinnovation.personipa.dto.MessageResponseDTO;
import com.digitalinnovation.personipa.dto.request.PersonDTO;
import com.digitalinnovation.personipa.entity.Person;
import com.digitalinnovation.personipa.exception.PersonNotFoundException;
import com.digitalinnovation.personipa.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonController {

    private PersonService personService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO) {

        return personService.createPerson(personDTO);
    }

    @GetMapping
    public List<PersonDTO> listAll() {
        return  personService.listAll();
    }

    @GetMapping("/{id}")
    public  PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
        return personService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody PersonDTO personDTO) throws PersonNotFoundException {
        return personService.updateById(id, personDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletedById(@PathVariable Long id) throws PersonNotFoundException {
        personService.Delete(id);
    }
}
