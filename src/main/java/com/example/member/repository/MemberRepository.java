package com.example.member.repository;

import org.springframework.stereotype.Repository;

import com.example.member.entity.Member;

@Repository
public interface MemberRepository extends BaseRepository<Member> {
}
