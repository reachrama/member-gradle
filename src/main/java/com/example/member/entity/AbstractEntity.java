package com.example.member.entity;

import java.io.Serializable;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> extends IdentifiableBase<ID> {
}
