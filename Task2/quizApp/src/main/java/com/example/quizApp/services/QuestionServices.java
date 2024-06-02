package com.example.quizApp.services;

import com.example.quizApp.Question;
import com.example.quizApp.Repositery.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServices
{@Autowired
Data data;

    public List<Question> getAllQuestions() {
    return data.findAll();
    }
}
