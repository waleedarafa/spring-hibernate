package com.example.contacts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contacts.entities.Office;

public interface OfficeRepository extends JpaRepository<Office, Long> {
}
