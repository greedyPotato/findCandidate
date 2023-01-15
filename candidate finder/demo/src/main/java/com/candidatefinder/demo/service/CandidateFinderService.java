package com.candidatefinder.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.candidatefinder.demo.dto.Job;
import com.candidatefinder.demo.entity.Candidate;

@Service
public interface CandidateFinderService {

    List<Candidate> findBestCandidates(Job job);

    int scoringSystem(Candidate candidate, Job job);
}
