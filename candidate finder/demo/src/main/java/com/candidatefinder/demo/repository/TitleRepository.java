package com.candidatefinder.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candidatefinder.demo.entity.Title;

public interface TitleRepository extends JpaRepository<Title, Integer> {

    public Title findByTitle(String title);
    
}
