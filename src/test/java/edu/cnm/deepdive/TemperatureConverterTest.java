package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureConverterTest {
  static final double FAHRENHEIT_TOLERANCE = 0.001;
  static final double CELSIUS_TOLERANCE = 0.0005;
  static final double[] testValueF = {-40, 32, 50};
  static final double[] testValueC = {-40, 0, 10};

  @Test
  void convertC2F() {
    for(int i = 0; i < testValueC.length; i++) {
      double f = TemperatureConverter.convertC2F(testValueC[i]);
      double tf = testValueF[i];

      assertEquals(tf, f, FAHRENHEIT_TOLERANCE);
    }
  }
}