package com.example.member.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "member_status")
public class MemberStatus extends TypeBase<Long> {
}
