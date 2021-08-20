package com.astanait.edu.kz.dao;

import com.astanait.edu.kz.entities.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CourseDAO extends CrudRepository<Course, UUID> {
}
