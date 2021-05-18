package com.example.member.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.member.entity.Member;
import com.example.member.entity.QMember;
import com.example.member.model.MemberDTO;
import com.example.member.repository.MemberRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.querydsl.jpa.impl.JPAQuery;

@Service
public class MemberService extends AbstractService<Member, MemberRepository>{

  @Autowired
  private ObjectMapper objectMapper;

  public MemberService(MemberRepository repository) {
    super(repository);
  }

  public Member save(Member member) {
    return repository.save(member);
  }

  public Member save(MemberDTO memberDTO) {
    Member member = objectMapper.convertValue(memberDTO, Member.class);
    return repository.save(member);
  }

  public Member fetchById(Long id) {
    Optional<Member> member = repository.findById(id);
    return member.orElse(null);
  }


 public Member findById(Long id) {
    final JPAQuery<Member> query = new JPAQuery<>(this.getEntityManager());
    QMember member = QMember.member;
    List<Member> memberList = query.from(member).where(member.id.eq(id)).fetch();
    if(memberList != null ) return memberList.get(0);
    return null;
  }

 public List<Member> findAll() {
   final JPAQuery<Member> query = new JPAQuery<>(this.getEntityManager());
    QMember member = QMember.member;
   return query.from(member).where(member.memberStatus.id.eq(20L)).fetch();
 }
}
