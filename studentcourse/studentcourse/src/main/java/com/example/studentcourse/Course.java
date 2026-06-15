package com.example.studentcourse;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;
    private String cname;
    public Course(){}
    public Course(String cname)
    {
        this.cname=cname;
    }
    @OneToMany(mappedBy = "course")
    private List<Student> students;

    public Long getCid()
    {
        return cid;
    }
    public String getCname()
    {
        return cname;
    }
    public void setCname(String cname)
    {
        this.cname = cname;
    }
    public List<Student> getStudents()
    {
        return students;
    }
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
}
