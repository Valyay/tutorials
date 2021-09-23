package com.tutorials.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorials.demo.model.Tutorial;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    Page<Tutorial> findByPublished(boolean published, Pageable pageable);
    Page<Tutorial> findByTitleContaining(String title, Pageable pageable);
}
