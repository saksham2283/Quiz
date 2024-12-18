package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.service.QuizService;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/question")
    public ResponseEntity<Question> getRandomQuestion() {
        return ResponseEntity.ok(quizService.getRandomQuestion());
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitAnswer(
            @RequestParam Long questionId,
            @RequestParam String userAnswer) {
        boolean isCorrect = quizService.checkAnswer(questionId, userAnswer);
        return ResponseEntity.ok(isCorrect ? "Correct!" : "Incorrect!");
    }
}
