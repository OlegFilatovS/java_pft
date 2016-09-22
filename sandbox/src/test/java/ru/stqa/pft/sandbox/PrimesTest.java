package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Primes.isPrime;
import static ru.stqa.pft.sandbox.Primes.isPrimeFast;

public class PrimesTest {

  @Test
  public void testPrime(){
    Assert.assertTrue(isPrimeFast(Integer.MAX_VALUE));
  }

  @Test
  public void testNonPrime(){
    Assert.assertFalse(isPrime(Integer.MAX_VALUE - 2));
  }

  @Test(enabled = false)
  public void testPrimeLong(){
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(isPrime(n));
  }
}
