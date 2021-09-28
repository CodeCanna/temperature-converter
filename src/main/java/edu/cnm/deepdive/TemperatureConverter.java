package edu.cnm.deepdive;

import java.util.Scanner;

public class TemperatureConverter {
  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    for (String arg : args) {
      System.out.println(arg + " degrees celsius is " + convertC2F(Double.parseDouble(arg)) + " degrees fahrenheit");
    }
  }

  /*
  Convert celsius to Fahrenheit
   */
  public static double convertC2F(double c) {
    return 9 * c / 5 + 32;
  }
}
