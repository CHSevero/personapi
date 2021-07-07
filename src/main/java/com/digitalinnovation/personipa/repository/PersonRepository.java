package com.digitalinnovation.personipa.repository;

import com.digitalinnovation.personipa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {
}
