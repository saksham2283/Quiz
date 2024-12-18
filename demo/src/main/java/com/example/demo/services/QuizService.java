package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Question;
import com.example.demo.repository.QuestionRepository;

@Service
public class QuizService {

    @Autowired
    private QuestionRepository questionRepository;

    public Question getRandomQuestion() {
        return questionRepository.findRandomQuestion();
    }

    public boolean checkAnswer(Long questionId, String userAnswer) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Question not found"));
        return question.getCorrectOption().equalsIgnoreCase(userAnswer);
    }
}
