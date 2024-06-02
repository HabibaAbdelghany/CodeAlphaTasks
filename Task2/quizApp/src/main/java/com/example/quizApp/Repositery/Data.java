package com.example.quizApp.Repositery;

import com.example.quizApp.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Data  extends JpaRepository<Question,Integer> { }
    //interger here for primary key

