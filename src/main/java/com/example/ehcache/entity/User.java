package com.example.ehcache.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "USER_TBL")
public class User implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String teamName;
    private String salary;

    public User(String name, String teamName, String salary) {
        this.name = name;
        this.teamName = teamName;
        this.salary = salary;
    }
}
