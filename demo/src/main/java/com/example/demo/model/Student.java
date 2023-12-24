package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class Student {
    @Id   //PK
    @GeneratedValue         //Sequence
    private Long id;
    @Column(name = "full_name")
    @NonNull
    private String name;
    private String email;
    private Date birthDate;
    @ManyToMany
    @JoinTable(   //breaking table of the many-to-many
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses = new HashSet<>();

    public Student() {
    }

    public Student(Long id, @NonNull String name, String email, Date birthDate, Set<Course> courses) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.courses = courses;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
