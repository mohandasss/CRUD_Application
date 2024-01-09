package com.example.CRUDoperation.repository;

import com.example.CRUDoperation.entity.studentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepository extends JpaRepository<studentEntity,Long> {
}
