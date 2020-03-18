package com.company;

import java.util.Vector;

public class Player {

  public String username;

  public String password;

  public Integer level;

    /**
   * 
   * @element-type Game
   */
  public Vector  myGame;

  public Boolean login(String username, String password) {
  return null;
  }

  public Boolean register( String username,  String password) {
  return null;
  }

  public String getusername() {
  return username;
  }

  public void setUsername( String username) {
    this.username=username;
  }

  public String getPassword() {
  return password;
  }

  public void setPassword( String password) {
    this.password=password;
  }

  public Integer getLevel() {
  return level ;
  }

  public void setLevel( Integer level) {
    this.level=level;
  }

  public Boolean joinGame( ) {
  return null;
  }

}