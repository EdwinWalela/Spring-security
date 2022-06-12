package com.example.demo.User;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
  private UserRepository repo;
  private final static String NOT_FOUND_MSG = "User with email %s not found"; 

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    return repo.findByEmail(email).orElseThrow(()->
         new UsernameNotFoundException(String.format(NOT_FOUND_MSG, email)));
  }
  
}
