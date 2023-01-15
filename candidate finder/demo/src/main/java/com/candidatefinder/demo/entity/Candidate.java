package com.candidatefinder.demo.entity;

import java.util.List;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int experience;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="candidates_skills", joinColumns = @JoinColumn(name="candidate_id",referencedColumnName = "id"),
     inverseJoinColumns = @JoinColumn(name = "skill_id",referencedColumnName = "id"))
    private List<Skill> skills;
}
