package com.example.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.entities.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
