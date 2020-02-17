package projecteuler;

import java.math.BigInteger;
import java.util.*;


public class Euler1 {

    /**
     * https://projecteuler.net/problem=1
     *
     * @return
     */
    public int multiplesOf3And5() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;

            }
        }
        return sum;
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
        List<Long> primeFactors = new ArrayList();
        Long n = 600851475143l;
        for (long i = 2l; i <= n; i++) {
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
        int sm_mul;
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
        sm_mul = max;
        return sm_mul;

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
        BigInteger p1 = BigInteger.ONE;
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
    public BigInteger largestProductInSeries() {
        String bigString = "73167176531330624919225119674426574742355349194934\n" +
                "96983520312774506326239578318016984801869478851843\n" +
                "85861560789112949495459501737958331952853208805511\n" +
                "12540698747158523863050715693290963295227443043557\n" +
                "66896648950445244523161731856403098711121722383113\n" +
                "62229893423380308135336276614282806444486645238749\n" +
                "30358907296290491560440772390713810515859307960866\n" +
                "70172427121883998797908792274921901699720888093776\n" +
                "65727333001053367881220235421809751254540594752243\n" +
                "52584907711670556013604839586446706324415722155397\n" +
                "53697817977846174064955149290862569321978468622482\n" +
                "83972241375657056057490261407972968652414535100474\n" +
                "82166370484403199890008895243450658541227588666881\n" +
                "16427171479924442928230863465674813919123162824586\n" +
                "17866458359124566529476545682848912883142607690042\n" +
                "24219022671055626321111109370544217506941658960408\n" +
                "07198403850962455444362981230987879927244284909188\n" +
                "84580156166097919133875499200524063689912560717606\n" +
                "05886116467109405077541002256983155200055935729725\n" +
                "71636269561882670428252483600823257530420752963450";
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
        while (bigInteger.compareTo(new BigInteger("2000000")) < 0) {
            bigInteger = bigInteger.nextProbablePrime();
            if (bigInteger.compareTo(new BigInteger("2000000")) < 0) {
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
    public BigInteger largeSum() {
        String large = "37107287533902102798797998220837590246510135740250\n" +
                "46376937677490009712648124896970078050417018260538\n" +
                "74324986199524741059474233309513058123726617309629\n" +
                "91942213363574161572522430563301811072406154908250\n" +
                "23067588207539346171171980310421047513778063246676\n" +
                "89261670696623633820136378418383684178734361726757\n" +
                "28112879812849979408065481931592621691275889832738\n" +
                "44274228917432520321923589422876796487670272189318\n" +
                "47451445736001306439091167216856844588711603153276\n" +
                "70386486105843025439939619828917593665686757934951\n" +
                "62176457141856560629502157223196586755079324193331\n" +
                "64906352462741904929101432445813822663347944758178\n" +
                "92575867718337217661963751590579239728245598838407\n" +
                "58203565325359399008402633568948830189458628227828\n" +
                "80181199384826282014278194139940567587151170094390\n" +
                "35398664372827112653829987240784473053190104293586\n" +
                "86515506006295864861532075273371959191420517255829\n" +
                "71693888707715466499115593487603532921714970056938\n" +
                "54370070576826684624621495650076471787294438377604\n" +
                "53282654108756828443191190634694037855217779295145\n" +
                "36123272525000296071075082563815656710885258350721\n" +
                "45876576172410976447339110607218265236877223636045\n" +
                "17423706905851860660448207621209813287860733969412\n" +
                "81142660418086830619328460811191061556940512689692\n" +
                "51934325451728388641918047049293215058642563049483\n" +
                "62467221648435076201727918039944693004732956340691\n" +
                "15732444386908125794514089057706229429197107928209\n" +
                "55037687525678773091862540744969844508330393682126\n" +
                "18336384825330154686196124348767681297534375946515\n" +
                "80386287592878490201521685554828717201219257766954\n" +
                "78182833757993103614740356856449095527097864797581\n" +
                "16726320100436897842553539920931837441497806860984\n" +
                "48403098129077791799088218795327364475675590848030\n" +
                "87086987551392711854517078544161852424320693150332\n" +
                "59959406895756536782107074926966537676326235447210\n" +
                "69793950679652694742597709739166693763042633987085\n" +
                "41052684708299085211399427365734116182760315001271\n" +
                "65378607361501080857009149939512557028198746004375\n" +
                "35829035317434717326932123578154982629742552737307\n" +
                "94953759765105305946966067683156574377167401875275\n" +
                "88902802571733229619176668713819931811048770190271\n" +
                "25267680276078003013678680992525463401061632866526\n" +
                "36270218540497705585629946580636237993140746255962\n" +
                "24074486908231174977792365466257246923322810917141\n" +
                "91430288197103288597806669760892938638285025333403\n" +
                "34413065578016127815921815005561868836468420090470\n" +
                "23053081172816430487623791969842487255036638784583\n" +
                "11487696932154902810424020138335124462181441773470\n" +
                "63783299490636259666498587618221225225512486764533\n" +
                "67720186971698544312419572409913959008952310058822\n" +
                "95548255300263520781532296796249481641953868218774\n" +
                "76085327132285723110424803456124867697064507995236\n" +
                "37774242535411291684276865538926205024910326572967\n" +
                "23701913275725675285653248258265463092207058596522\n" +
                "29798860272258331913126375147341994889534765745501\n" +
                "18495701454879288984856827726077713721403798879715\n" +
                "38298203783031473527721580348144513491373226651381\n" +
                "34829543829199918180278916522431027392251122869539\n" +
                "40957953066405232632538044100059654939159879593635\n" +
                "29746152185502371307642255121183693803580388584903\n" +
                "41698116222072977186158236678424689157993532961922\n" +
                "62467957194401269043877107275048102390895523597457\n" +
                "23189706772547915061505504953922979530901129967519\n" +
                "86188088225875314529584099251203829009407770775672\n" +
                "11306739708304724483816533873502340845647058077308\n" +
                "82959174767140363198008187129011875491310547126581\n" +
                "97623331044818386269515456334926366572897563400500\n" +
                "42846280183517070527831839425882145521227251250327\n" +
                "55121603546981200581762165212827652751691296897789\n" +
                "32238195734329339946437501907836945765883352399886\n" +
                "75506164965184775180738168837861091527357929701337\n" +
                "62177842752192623401942399639168044983993173312731\n" +
                "32924185707147349566916674687634660915035914677504\n" +
                "99518671430235219628894890102423325116913619626622\n" +
                "73267460800591547471830798392868535206946944540724\n" +
                "76841822524674417161514036427982273348055556214818\n" +
                "97142617910342598647204516893989422179826088076852\n" +
                "87783646182799346313767754307809363333018982642090\n" +
                "10848802521674670883215120185883543223812876952786\n" +
                "71329612474782464538636993009049310363619763878039\n" +
                "62184073572399794223406235393808339651327408011116\n" +
                "66627891981488087797941876876144230030984490851411\n" +
                "60661826293682836764744779239180335110989069790714\n" +
                "85786944089552990653640447425576083659976645795096\n" +
                "66024396409905389607120198219976047599490197230297\n" +
                "64913982680032973156037120041377903785566085089252\n" +
                "16730939319872750275468906903707539413042652315011\n" +
                "94809377245048795150954100921645863754710598436791\n" +
                "78639167021187492431995700641917969777599028300699\n" +
                "15368713711936614952811305876380278410754449733078\n" +
                "40789923115535562561142322423255033685442488917353\n" +
                "44889911501440648020369068063960672322193204149535\n" +
                "41503128880339536053299340368006977710650566631954\n" +
                "81234880673210146739058568557934581403627822703280\n" +
                "82616570773948327592232845941706525094512325230608\n" +
                "22918802058777319719839450180888072429661980811197\n" +
                "77158542502016545090413245809786882778948721859617\n" +
                "72107838435069186155435662884062257473692284509516\n" +
                "20849603980134001723930671666823555245252804609722\n" +
                "53503534226472524250874054075591789781264330331690";
        String largeReplace = large.replaceAll("\\s", "");
        BigInteger largeSum = new BigInteger("0");
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
        BigInteger bigInteger = new BigInteger("2").pow(1000);
        String bigString = bigInteger.toString();
        int sum = 0;
        for (int i = 0; i < bigString.length(); i++) {
            sum += Integer.valueOf(bigString.substring(i, i + 1));
        }
        return sum;
    }

    /**
     * https://projecteuler.net/problem=20
     *
     * @return
     */
    public int factorialDigitSum() {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= 100; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        String factorial = fact.toString();
        int sum = 0;
        for (int i = 0; i < factorial.length(); i++) {
            sum += Integer.valueOf(factorial.substring(i, i + 1));
        }
        return sum;
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