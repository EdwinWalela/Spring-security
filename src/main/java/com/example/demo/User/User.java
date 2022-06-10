package com.example.demo.User;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails  {

  private Long id;
  private String name;
  private String username;
  private String email;
  private String password;
  private UserRole role;
  private Boolean locked;
  private Boolean enabled;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getPassword() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getUsername() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isAccountNonExpired() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isEnabled() {
    // TODO Auto-generated method stub
    return false;
  }
  
}
