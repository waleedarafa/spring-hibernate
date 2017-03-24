package com.example.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
