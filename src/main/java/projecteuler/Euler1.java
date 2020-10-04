package projecteuler;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class Euler1 {

    /**
     * https://projecteuler.net/problem=1
     *
     * @return
     */
    public int multiplesOf3And5() {
        return Stream.iterate(0, n -> n + 1).limit(1000)
                .filter(n -> (n % 3 == 0 || n % 5 == 0))
                .mapToInt(Integer::intValue)
                .sum();
    }

    /**
     * https://projecteuler.net/problem=2
     *
     * @return
     */
    public long evenFibonacciNumbers() {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int sum = 0;
        fibonacci.add(1);
        fibonacci.add(2);
        while (sum < 4000000) {
            sum = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            fibonacci.add(sum);

        }
        long sum1 = 0L;
        for (int i = 0; i < fibonacci.size() - 1; i++) {
            if (fibonacci.get(i) % 2 == 0) {
                sum1 = sum1 + fibonacci.get(i);
            }

        }
        return sum1;
    }

    /**
     * https://projecteuler.net/problem=3
     *
     * @return
     */
    public static Long largestPrimeFactors() {
        List<Long> primeFactors = new ArrayList<>();
        Long n = 600851475143l;
        for (long i = 2L; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        Collections.sort(primeFactors);
        return primeFactors.get(primeFactors.size() - 1);
    }

    /**
     * https://projecteuler.net/problem=4
     *
     * @return
     */
    public static long largestPalindromeProduct() {
        List<Long> palindromeProducts = new ArrayList<>();
        long product;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                product = i * j;
                if (String.valueOf(product).equals(new StringBuilder(String.valueOf(product)).reverse().toString())) {
                    palindromeProducts.add(product);
                }
            }
        }
        Collections.sort(palindromeProducts);
        return palindromeProducts.get(palindromeProducts.size() - 1);
    }

    /**
     * https://projecteuler.net/problem=5
     *
     * @return
     */
    public int smallestMultiple() {
        int max;
        int counter1 = 0;
        int sumMul;
        int[] num = new int[20];
        for (int i = 0; i < 20; i++) {
            num[i] = i + 1;
        }
        Arrays.sort(num);
        max = num[19];
        while (counter1 < 20) {
            counter1 = 0;
            for (int j = 0; j < 20; j++) {
                if (max % num[j] == 0) {
                    counter1 = counter1 + 1;
                }

            }
            if (counter1 != 20) {
                max = max + 1;
            }
        }
        sumMul = max;
        return sumMul;

    }

    /**
     * https://projecteuler.net/problem=6
     */
    public static int sumSquareDiff() {
        int sum1 = 0;
        for (int i = 1; i < 101; i++) {
            sum1 = (int) (sum1 + Math.pow(i, 2));
        }
        int sum2 = 0;
        for (int k = 1; k < 101; k++) {
            sum2 = sum2 + k;
        }
        int diff;
        diff = ((int) Math.pow(sum2, 2) - sum1);
        return diff;
    }

    /**
     * https://projecteuler.net/problem=7
     *
     * @return
     */
    public BigInteger primeNth() {
        List<BigInteger> primeNumbers = new ArrayList<>();
        var p1 = BigInteger.ONE;
        do {
            p1 = p1.nextProbablePrime();
            primeNumbers.add(p1);

        } while (primeNumbers.size() != 10001);
        return p1;
    }

    /**
     * https://projecteuler.net/problem=8
     *
     * @return
     */
    public BigInteger largestProductInSeries() throws IOException {
        Path path = Paths.get("src/main/java/resources/largestProductInSeries.txt");
        String bigString = Files.readString(path, StandardCharsets.ISO_8859_1);
        String largeReplace = bigString.replaceAll("\\s", "");
        BigInteger bigInteger = BigInteger.ONE;
        List<BigInteger> listOfProducts = new ArrayList<>();
        char[] charsArray = largeReplace.toCharArray();
        for (int i = 0; i < largeReplace.length() - 13; i++) {
            for (int j = 0; j < 13; j++) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf((long) charsArray[i + j] - '0'));
            }
            listOfProducts.add(bigInteger);
            bigInteger = BigInteger.ONE;
        }
        Collections.sort(listOfProducts);
        return listOfProducts.get(listOfProducts.size() - 1);
    }

    /**
     * https://projecteuler.net/problem=9
     */
    public static long specialPythagoreanTriplet() {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                for (int k = 0; k < 1001; k++) {
                    if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2) && i + j + k == 1000 && i < j && j < k) {
                        a = i;
                        b = j;
                        c = k;

                    }
                }
            }
        }
        return a * b * c;
    }

    /**
     * https://projecteuler.net/problem=10
     *
     * @return
     */
    public BigInteger sumOfPrimes() {
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        while (bigInteger.compareTo(BigInteger.valueOf(2000000)) < 0) {
            bigInteger = bigInteger.nextProbablePrime();
            if (bigInteger.compareTo(BigInteger.valueOf(2000000)) < 0) {
                sum = sum.add(bigInteger);
            }
        }
        return sum;
    }

    /**
     * https://projecteuler.net/problem=13
     *
     * @return
     */
    public BigInteger largeSum() throws IOException {
        Path path = Paths.get("src/main/java/resources/largeSum.txt");
        String large = Files.readString(path, StandardCharsets.ISO_8859_1);
        String largeReplace = large.replaceAll("\\s", "");
        BigInteger largeSum = BigInteger.ZERO;
        int count = 0;
        do {
            largeSum = largeSum.add(new BigInteger(largeReplace.substring(count, count + 50)));
            count = count + 50;
        } while (count < 5000);
        return new BigInteger(largeSum.toString().substring(0, 10));
    }

    /**
     * https://projecteuler.net/problem=16
     *
     * @return
     */
    public int powerDigitSum() {
        BigInteger bigInteger = BigInteger.valueOf(2).pow(1000);
        String bigString = bigInteger.toString();
        int sum = 0;
        for (int i = 0; i < bigString.length(); i++) {
            sum += Integer.parseInt(bigString.substring(i, i + 1));
        }
        return sum;
    }

    /**
     * https://projecteuler.net/problem=20
     *
     * @return
     */
    public int factorialDigitSum() {
        BigInteger factorial = factorial(100);
        return Stream.iterate(0, i -> i + 1)
                .limit(factorial.toString().length())
                .mapToInt(i -> Integer.parseInt(factorial.toString().substring(i, i + 1)))
                .sum();
    }

    private BigInteger factorial(long limit) {
        return Stream.iterate(1, i -> i + 1)
                .limit(limit)
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    /**
     * https://projecteuler.net/problem=25
     *
     * @return
     */
    public int indexFibonacciNth() {
        ArrayList<BigInteger> fibon = new ArrayList<>();
        fibon.add(BigInteger.valueOf(1));
        fibon.add(BigInteger.valueOf(1));
        BigInteger sum;
        while (fibon.get(fibon.size() - 1).toString().length() < 1000) {
            sum = fibon.get(fibon.size() - 1).add(fibon.get(fibon.size() - 2));
            fibon.add(sum);
        }
        return fibon.size();
    }

    /**
     * https://projecteuler.net/problem=29
     *
     * @return
     */
    public int distinctPowers() {
        BigInteger d;
        List<BigInteger> results = new ArrayList<>();
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j <= 100; j++) {
                d = BigInteger.valueOf(i).pow(j);
                results.add(d);
            }
        }
        Collection<BigInteger> distinct = new HashSet<>(results);
        return distinct.size();
    }

    /**
     * https://projecteuler.net/problem=48
     *
     * @return
     */
    public BigInteger lastTenDigitsOfSelfPowers() {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i = 1; i < 1001; i++) {
            bigInteger = bigInteger.add(BigInteger.valueOf(i).pow(i));
        }
        String stringBigInteger = bigInteger.toString();
        return new BigInteger(stringBigInteger.substring(stringBigInteger.length() - 10));
    }


}