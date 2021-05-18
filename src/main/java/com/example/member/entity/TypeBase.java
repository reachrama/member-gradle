package com.example.member.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class TypeBase<ID extends Serializable> extends IdentifiableBase<ID> {

  private String name;
  //private String description;
 // @Column(name = "sort_order")
 // private int order;
 // private boolean active;

}
