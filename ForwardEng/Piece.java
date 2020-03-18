package com.company;

public class Piece {

  public String color;

  public String position;

  public String status;

  public String name;


  public String getColor() {
  return color;
  }

  public String getPosition() {
  return position;
  }

  public void setPosition( String position) {
    this.position=position;
  }

  public void setStatus( String status) {
    this.status=status;
  }

  public String getStatus() {
  return status;
  }

}