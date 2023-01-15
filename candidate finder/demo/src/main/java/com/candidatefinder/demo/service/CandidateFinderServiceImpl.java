package com.candidatefinder.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candidatefinder.demo.dto.Job;
import com.candidatefinder.demo.entity.Candidate;
import com.candidatefinder.demo.repository.CandidateRepository;
import com.candidatefinder.demo.repository.TitleRepository;


@Service
public class CandidateFinderServiceImpl implements CandidateFinderService{

    @Autowired
    CandidateRepository candidateRepository;

    @Autowired
    TitleRepository titleRepository;

    @Override
    public List<Candidate> findBestCandidates(Job job) {
        
        List<Candidate> bestCandidates = candidateRepository.findAll().stream().filter(candidate -> scoringSystem(candidate, job) > 5).collect(Collectors.toList());
     

        return bestCandidates;
    }

    @Override
    public int scoringSystem(Candidate candidate, Job job) {

        int score = 0;
        // if candidate hold a skill same as the job skill(example: java - java)
        if(candidate.getSkills().stream().anyMatch(skill -> skill.getName().equals(job.getSkill().getName()))){
            score = score +6;
        }
        //if same job title = 3 points
        //else if same catagory = 2 points(example: software developer - software engineer)
        if(job.getTitle().equals(candidate.getTitle())){
            score = score +3;
        }else{
            if(titleRepository.findByTitle(job.getTitle()).getCategory() == titleRepository.findByTitle(candidate.getTitle()).getCategory()){
                score = score +2;
            }

        }
        //check exp years
        if(candidate.getExperience() >= job.getYearsOfExp()){
            if(candidate.getExperience() > 3){
                score = score + 3;
            }else{
                score = score + candidate.getExperience();
            }

            
            
        }
        
    
        return score;
    }
    
}
