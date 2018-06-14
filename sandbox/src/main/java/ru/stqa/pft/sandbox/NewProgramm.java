package ru.stqa.pft.sandbox;

public class NewProgramm {
  public static void main(String[] args) {
    Square s = new Square(5);

    System.out.println("Area of square with side " + s.l + " = " + s.area());
    Rectangle r = new Rectangle(6, 8);

    System.out.println("Area of rectangle with sides " + r.a + " & " + r.b + " = " + r.area());
  }


}
