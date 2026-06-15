package com.example.studentcourse;

import org.springframework.data.jpa.repository.JpaRepository;

interface CourseRepository extends JpaRepository<Course, Long> {}

