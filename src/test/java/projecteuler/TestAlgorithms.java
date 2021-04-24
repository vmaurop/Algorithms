package projecteuler;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

public class TestAlgorithms {

    @Test
    public void smallestMultiples(){
        int smallestMul = 233168;
        Assert.assertEquals(new Euler1().multiplesOf3And5(), smallestMul);
    }

    @Test
    public void primeNth(){
        BigInteger primeNth = BigInteger.valueOf(104743);
        Assert.assertEquals(new Euler1().primeNth(), primeNth);
    }

    @Test
    public void factorialDigitSum(){
        int digitSum = 648;
        Assert.assertEquals(new Euler1().factorialDigitSum(), digitSum);
    }

    @Test
    public void evenFibonacciNumbers(){
        int evenFibonaci = 4613732;
        Assert.assertEquals(new Euler1().evenFibonacciNumbers(), evenFibonaci);
    }

    @Test
    public void sumSquareDiff(){
        int sumSquareDiff = 25164150;
        Assert.assertEquals(Euler1.sumSquareDiff(), sumSquareDiff);
    }

    @Test
    public void specialPythagoreanTriplet(){
        long specialPythagoreanTriplet = 31875000;
        Assert.assertEquals(Euler1.specialPythagoreanTriplet(), specialPythagoreanTriplet);
    }

}
