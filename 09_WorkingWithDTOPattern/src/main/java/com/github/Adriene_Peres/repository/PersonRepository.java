package com.github.Adriene_Peres.repository;

import com.github.Adriene_Peres.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
