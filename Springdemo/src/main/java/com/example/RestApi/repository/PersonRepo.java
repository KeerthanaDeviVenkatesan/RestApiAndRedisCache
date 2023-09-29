package com.example.RestApi.repository;

import com.example.RestApi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}

