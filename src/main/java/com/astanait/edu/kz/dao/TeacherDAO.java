package com.astanait.edu.kz.dao;

import com.astanait.edu.kz.entities.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TeacherDAO extends CrudRepository<Teacher, UUID> {
}
