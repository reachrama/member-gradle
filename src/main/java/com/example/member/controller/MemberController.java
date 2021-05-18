package com.example.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.member.entity.Member;
import com.example.member.model.MemberDTO;
import com.example.member.service.MemberService;

@RestController
@RequestMapping("/api/members")
public class MemberController {

  @Autowired
  private MemberService memberService;

  @GetMapping(value = "/test")
  public String handleTestMessage() {
    return "Hello World";
  }

  @PostMapping
  public Member handleSave(@RequestBody MemberDTO memberDTO) {
    return memberService.save(memberDTO);
  }

  @GetMapping("/{id}")
  public Member handleFetchById(@PathVariable Long id){
    return memberService.findById(id);
  }

  @GetMapping
  public List<Member> handleFetchAll() {
    return memberService.findAll();
  }

}
