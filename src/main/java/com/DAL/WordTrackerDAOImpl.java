package com.example.dal;

import com.example.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WordTrackerDAOImpl implements WordTrackerDAO  {

    public void wordUpdate(String word, String conversion)

    public Optional<List<WordStats>> find(String word)

    public void createWord(String word, String conversion)

    public Optional<List<WordStats>> findAll()

}
