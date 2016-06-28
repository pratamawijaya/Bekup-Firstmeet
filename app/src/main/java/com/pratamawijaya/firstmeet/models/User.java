package com.pratamawijaya.firstmeet.models;

/**
 * Created by pratama on 6/28/16.
 */
public class User {
  // attribute
  private String username;
  private String password;

  // private -> access modifier --> encapsulasi
  // public
  // protected

  //default constructor
  public User(){
  }

  // second constructor
  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User(String username) {
    this.username = username;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
