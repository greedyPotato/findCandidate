package com.candidatefinder.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.candidatefinder.demo.entity.Candidate;
import com.candidatefinder.demo.entity.Skill;
import com.candidatefinder.demo.entity.Title;
import com.candidatefinder.demo.repository.CandidateRepository;
import com.candidatefinder.demo.repository.TitleRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	CandidateRepository candidateRepository;

	@Autowired
	TitleRepository titleRepository;

	@Test
	void serviceTest() {
		Skill skill1 = new Skill();
	
		skill1.setName("java");
		
		Skill skill2 = new Skill();
		
		skill2.setName("c++");

		List<Skill> skills = new ArrayList<>();
		skills.add(skill1);
		skills.add(skill2);

		Candidate candidate1 = new Candidate();
		
		candidate1.setTitle("software engineer");
		candidate1.setExperience(2);
		candidate1.setSkills(skills);

		candidateRepository.save(candidate1);
	}


	@Test
	void playCandidate() {
		Skill skill1 = new Skill();
	
		skill1.setName("react");
		
		Skill skill2 = new Skill();
		
		skill2.setName("php");

		List<Skill> skills = new ArrayList<>();
		skills.add(skill1);
		

		Candidate candidate1 = new Candidate();
		
		candidate1.setTitle("data engineer");
		candidate1.setExperience(3);
		candidate1.setSkills(skills);

		candidateRepository.save(candidate1);
	}


	@Test
	void createTitles() {
		Title title = new Title();
			title.setCategory(1);
			title.setTitle("software engineer");
			Title title2 = new Title();
			title2.setCategory(1);
			title2.setTitle("software developer");
			Title title3 = new Title();
			title3.setCategory(2);
			title3.setTitle("data engineer");

			titleRepository.save(title);
			titleRepository.save(title2);
			titleRepository.save(title3);
	}
}
