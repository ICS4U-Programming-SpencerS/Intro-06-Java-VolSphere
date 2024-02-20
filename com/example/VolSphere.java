package com.example;

import java.util.Scanner;

/**
 * Program designed to test user input and math operators.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Feb-14
 */
public final class VolSphere {
  /** Stops random instantiation's from happening. */
  private VolSphere() {
    // Prevents instantiation.
  }

  /**
   * Main class code.
   *
   * @param args Command line arguments (not used).
   */
  public static void main(String[] args) {
    // For user input.
    final Scanner in = new Scanner(System.in);

    // Opening line and input
    System.out.println("This program calculate's the volume of a sphere.");

    // Using this loop, you can check user input.
    // If bad input = fail/restart.
    while (true) {
      // Input for radius.
      System.out.print("Enter the radius: ");
      final String radiusStr = in.nextLine();
      // sets out as a string before converted to double.
      final double radiusDou = Double.parseDouble(radiusStr);
      if (radiusDou <= 0) {
        // if the input is less then 0 or a negative number = try again.
        System.out.println(radiusDou + " input invalid. Try again!");
      } else {
        // if valid input, move to calculation and final display.
        System.out.println("The area of a circle with a radius of... ");
        System.out.print(radiusDou);
        System.out.println(" is ");
        // Line length too big, half parts fix.
        final double part1 = (4.0f / 3.0f) * Math.PI;
        final double part2 = part1 * Math.pow(radiusDou, 3);
        System.out.format("%.2f", part2);
        System.out.println("cm^3!");
        break;
      }
    }
    in.close();
  }
}
