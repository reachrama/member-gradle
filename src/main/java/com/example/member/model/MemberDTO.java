package com.example.member.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDTO extends BaseDTO {

  private String name;
  private MemberStatusDTO memberStatus;
  private BigDecimal asset;
  private int createdBy;

}
