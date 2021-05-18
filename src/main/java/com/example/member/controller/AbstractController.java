package com.example.member.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.member.entity.AbstractEntity;
import com.example.member.service.BaseService;

public abstract class AbstractController<E extends AbstractEntity, S extends BaseService<E>> {

  private final S service;

  protected AbstractController(S service) {
    this.service = service;
  }

  public ResponseEntity<E> handleSave(@RequestBody E entity) throws Exception {
    return null;
  }
}
