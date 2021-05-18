package com.example.member.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.member.entity.AbstractEntity;
import com.example.member.repository.BaseRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.core.types.EntityPath;
import com.querydsl.jpa.impl.JPAQuery;

import lombok.Data;

@Data
public abstract class AbstractService<E extends AbstractEntity, R extends BaseRepository<E>> {

  protected final R repository;

  @Autowired
  private ObjectMapper objectMapper;
  @PersistenceContext
  private EntityManager entityManager;

  protected AbstractService(R repository) {
    this.repository = repository;
  }

  protected JPAQuery<?> from(EntityPath<?> paths) {
    return new JPAQuery<>(entityManager).from(paths);
  }



}
