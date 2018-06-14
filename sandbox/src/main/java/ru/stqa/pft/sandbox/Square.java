package ru.stqa.pft.sandbox;

public class Square {
  public double l;

  public Square(){

  }
  public Square(double d){
    l = d;
  }
  public  double area() {
    return this.l * this.l;
  }
}
