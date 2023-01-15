package com.candidatefinder.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.candidatefinder.demo.entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
    
}
