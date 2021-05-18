package com.example.member.entity;

import java.math.BigDecimal;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "members")
@Getter
@Setter
public class Member extends AbstractEntity<Long>{

  private String name;
  @OneToOne
  @JoinColumn(name = "status")
  private MemberStatus memberStatus;
  private BigDecimal asset;
  @Column(name = "created_by")
  private Long createdBy;

}
