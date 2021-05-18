package com.example.member.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiError {

  private HttpStatus status;
 // private LocalDateTime timeStamp;
  private String message;
  private String debugMessage;
}
