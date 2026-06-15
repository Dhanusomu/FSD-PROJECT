package com.example.studentcourse;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studid;
    private String studname;
    public Student(){}
    public Student(String studname)
    {
        this.studname = studname;
    }

    @ManyToOne
    @JoinColumn(name = "cid")
    private Course course;

    public Long getStudid()
    {
        return studid;
    }
    public String getStudname()
    {
        return studname;
    }
    public void setStudname(String studname)
    {
        this.studname = studname;
    }
    public Course getCourse()
    {
        return course;
    }
    public void setCourse(Course course)
    {
        this.course = course;
    }
}
