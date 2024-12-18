package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query(value = "SELECT * FROM QUESTION ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Question findRandomQuestion();
}
