package com.example.crudwithjdbcmysql.repository;

import com.example.crudwithjdbcmysql.model.Tutorial;

import java.util.List;

public interface TutorialRepository {

    int save(Tutorial book);

    int update(Tutorial book);

    Tutorial findById(Long id);

    int deleteById(Long id);

    List<Tutorial> findAll();

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);

    int deleteAll();
}
