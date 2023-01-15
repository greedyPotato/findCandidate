package com.candidatefinder.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.candidatefinder.demo.dto.Job;
import com.candidatefinder.demo.entity.Candidate;
import com.candidatefinder.demo.service.CandidateFinderService;

@RestController
public class CandidateFinderController {

    @Autowired
    CandidateFinderService candidateFinderService;
    @PostMapping("/api/findCandidates")
    public List<Candidate> findBestCandidates(@RequestBody Job job){
        
        return candidateFinderService.findBestCandidates(job);
    }
}