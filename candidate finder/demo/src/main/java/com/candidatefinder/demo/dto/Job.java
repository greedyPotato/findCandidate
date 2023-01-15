package com.candidatefinder.demo.dto;


import com.candidatefinder.demo.entity.Skill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Job {
    
    
    private int id;

    private String title;
    
    private int yearsOfExp;
    
    private Skill skill;
}
