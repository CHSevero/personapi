package com.digitalinnovation.personipa.service;

import com.digitalinnovation.personipa.dto.MessageResponseDTO;
import com.digitalinnovation.personipa.entity.Person;
import com.digitalinnovation.personipa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);

        return MessageResponseDTO
                .builder()
                .message("Created person wit ID " + savedPerson.getId())
                .build();
    }
}
