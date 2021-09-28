package edu.cnm.deepdive;

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while(true) {
      System.out.println("Enter a value in degrees celsius:");
      double c = scanner.nextDouble();
      System.out.println(convertC2F(c));
    }
  }

  /*
  Convert celsius to Fahrenheit
   */
  public static double convertC2F(double c) {
    return 9 * c / 5 + 32;
  }
}
