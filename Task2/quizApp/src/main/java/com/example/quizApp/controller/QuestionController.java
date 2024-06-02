package com.example.quizApp.controller;

import com.example.quizApp.Question;
import com.example.quizApp.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionServices questionServices;

    @GetMapping("allQuestion")
    public List< Question> getAllQuestion(){
        return questionServices.getAllQuestions();
    }
}