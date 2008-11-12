import java.lang.Math;
import java.text.DecimalFormat; //import java.util.ArrayList;
import java.math.BigInteger;

/**
 * 这是Project euler上的习题，PE#表示相应的题号：例如:PE1();
 * 
 * @author zhangyiluo@126.com
 * 
 */

public class PlayPE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(PE07());
	}

	/**
	 * Problem 48 求Fibonacci序列
	 * 
	 */
	public static String PE48() {
		BigInteger sum = BigInteger.valueOf(0);
		for (int i = 1; i <= 1000; i++) {
			sum = BigInteger.valueOf(i).pow(i).add(sum);
		}
		return sum.toString().substring(sum.toString().length() - 10);
	}

	/**
	 * Problem 25 求Fibonacci序列
	 * 
	 */
	public static long PE25() {
		long result = 0;
		for (int i = 10; i < 10000; i++) {
			if (Fibonacci2(i).toString().length() == 1000) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static BigInteger Fibonacci(int n) {
		if (n == 30) {
			return BigInteger.valueOf(832040);
		} else if (n == 31) {
			return BigInteger.valueOf(1346269);
		} else {
			return Fibonacci(n - 1).add(Fibonacci(n - 2));
		}
	}

	public static BigInteger Fibonacci2(int n) {
		BigInteger a = BigInteger.valueOf(1);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(0);

		for (int i = 2; i < n; i++) {
			c = a.add(b);
			a = b;
			b = c;
		}
		return c;
	}

	/**
	 * Problem 13 Work out the first ten digits of the sum of the following
	 * one-hundred 50-digit numbers.
	 * 分析:题意是，求100行加起来的结果的前10个数字。每50个数字，应该说字符，转成BigInteger， 相加后，转成字符串，取前10位数字。
	 * 技巧，每50行取一次计算。
	 */
	public static String PE13() {
		BigInteger sum = BigInteger.valueOf(0);
		StringBuffer str = new StringBuffer();
		str.append("37107287533902102798797998220837590246510135740250"
				+ "46376937677490009712648124896970078050417018260538"
				+ "74324986199524741059474233309513058123726617309629"
				+ "91942213363574161572522430563301811072406154908250"
				+ "23067588207539346171171980310421047513778063246676"
				+ "89261670696623633820136378418383684178734361726757"
				+ "28112879812849979408065481931592621691275889832738"
				+ "44274228917432520321923589422876796487670272189318"
				+ "47451445736001306439091167216856844588711603153276"
				+ "70386486105843025439939619828917593665686757934951"
				+ "62176457141856560629502157223196586755079324193331"
				+ "64906352462741904929101432445813822663347944758178"
				+ "92575867718337217661963751590579239728245598838407"
				+ "58203565325359399008402633568948830189458628227828"
				+ "80181199384826282014278194139940567587151170094390"
				+ "35398664372827112653829987240784473053190104293586"
				+ "86515506006295864861532075273371959191420517255829"
				+ "71693888707715466499115593487603532921714970056938"
				+ "54370070576826684624621495650076471787294438377604"
				+ "53282654108756828443191190634694037855217779295145"
				+ "36123272525000296071075082563815656710885258350721"
				+ "45876576172410976447339110607218265236877223636045"
				+ "17423706905851860660448207621209813287860733969412"
				+ "81142660418086830619328460811191061556940512689692"
				+ "51934325451728388641918047049293215058642563049483"
				+ "62467221648435076201727918039944693004732956340691"
				+ "15732444386908125794514089057706229429197107928209"
				+ "55037687525678773091862540744969844508330393682126"
				+ "18336384825330154686196124348767681297534375946515"
				+ "80386287592878490201521685554828717201219257766954"
				+ "78182833757993103614740356856449095527097864797581"
				+ "16726320100436897842553539920931837441497806860984"
				+ "48403098129077791799088218795327364475675590848030"
				+ "87086987551392711854517078544161852424320693150332"
				+ "59959406895756536782107074926966537676326235447210"
				+ "69793950679652694742597709739166693763042633987085"
				+ "41052684708299085211399427365734116182760315001271"
				+ "65378607361501080857009149939512557028198746004375"
				+ "35829035317434717326932123578154982629742552737307"
				+ "94953759765105305946966067683156574377167401875275"
				+ "88902802571733229619176668713819931811048770190271"
				+ "25267680276078003013678680992525463401061632866526"
				+ "36270218540497705585629946580636237993140746255962"
				+ "24074486908231174977792365466257246923322810917141"
				+ "91430288197103288597806669760892938638285025333403"
				+ "34413065578016127815921815005561868836468420090470"
				+ "23053081172816430487623791969842487255036638784583"
				+ "11487696932154902810424020138335124462181441773470"
				+ "63783299490636259666498587618221225225512486764533"
				+ "67720186971698544312419572409913959008952310058822"
				+ "95548255300263520781532296796249481641953868218774"
				+ "76085327132285723110424803456124867697064507995236"
				+ "37774242535411291684276865538926205024910326572967"
				+ "23701913275725675285653248258265463092207058596522"
				+ "29798860272258331913126375147341994889534765745501"
				+ "18495701454879288984856827726077713721403798879715"
				+ "38298203783031473527721580348144513491373226651381"
				+ "34829543829199918180278916522431027392251122869539"
				+ "40957953066405232632538044100059654939159879593635"
				+ "29746152185502371307642255121183693803580388584903"
				+ "41698116222072977186158236678424689157993532961922"
				+ "62467957194401269043877107275048102390895523597457"
				+ "23189706772547915061505504953922979530901129967519"
				+ "86188088225875314529584099251203829009407770775672"
				+ "11306739708304724483816533873502340845647058077308"
				+ "82959174767140363198008187129011875491310547126581"
				+ "97623331044818386269515456334926366572897563400500"
				+ "42846280183517070527831839425882145521227251250327"
				+ "55121603546981200581762165212827652751691296897789"
				+ "32238195734329339946437501907836945765883352399886"
				+ "75506164965184775180738168837861091527357929701337"
				+ "62177842752192623401942399639168044983993173312731"
				+ "32924185707147349566916674687634660915035914677504"
				+ "99518671430235219628894890102423325116913619626622"
				+ "73267460800591547471830798392868535206946944540724"
				+ "76841822524674417161514036427982273348055556214818"
				+ "97142617910342598647204516893989422179826088076852"
				+ "87783646182799346313767754307809363333018982642090"
				+ "10848802521674670883215120185883543223812876952786"
				+ "71329612474782464538636993009049310363619763878039"
				+ "62184073572399794223406235393808339651327408011116"
				+ "66627891981488087797941876876144230030984490851411"
				+ "60661826293682836764744779239180335110989069790714"
				+ "85786944089552990653640447425576083659976645795096"
				+ "66024396409905389607120198219976047599490197230297"
				+ "64913982680032973156037120041377903785566085089252"
				+ "16730939319872750275468906903707539413042652315011"
				+ "94809377245048795150954100921645863754710598436791"
				+ "78639167021187492431995700641917969777599028300699"
				+ "15368713711936614952811305876380278410754449733078"
				+ "40789923115535562561142322423255033685442488917353"
				+ "44889911501440648020369068063960672322193204149535"
				+ "41503128880339536053299340368006977710650566631954"
				+ "81234880673210146739058568557934581403627822703280"
				+ "82616570773948327592232845941706525094512325230608"
				+ "22918802058777319719839450180888072429661980811197"
				+ "77158542502016545090413245809786882778948721859617"
				+ "72107838435069186155435662884062257473692284509516"
				+ "20849603980134001723930671666823555245252804609722"
				+ "53503534226472524250874054075591789781264330331690");
		for (int i = 0; i < str.length(); i = i + 50) {
			String s = str.substring(i, i + 50);
			sum = sum.add(new BigInteger(s, 10));
		}
		return sum.toString().substring(0, 9);
	}

	/**
	 * Problem 20 21 June 2002 n! means n (n 1) ... 3 2 1
	 * 
	 * Find the sum of the digits in the number 100! 分析：题目的意思是将所有数字加起来求和。
	 * 困难：超出正常类型范围，求助BigNumber。
	 */
	public static long PE20() {

		long result = 0;
		String str = FactorialBig(BigInteger.valueOf(100)).toString();

		for (int i = 0; i < str.length(); i++) {
			result += Integer.valueOf(String.valueOf(str.charAt(i)));
		}

		return result;

	}

	public static BigInteger FactorialBig(BigInteger a) {
		BigInteger ONE = BigInteger.valueOf(1);
		if (a.compareTo(ONE) == 0) {
			return a;
		} else {
			return a.multiply(FactorialBig(a.subtract(ONE)));
		}
	}

	/**
	 * Problem 16 03 May 2002 2^15 = 32768 and the sum of its digits is 3 + 2 +
	 * 7 + 6 + 8 = 26. What is the sum of the digits of the number 2^1000?
	 * 分析：首先，计算2的千幂,将数字逐个抽取相加，可采用PE4()的求幂方法得出每一个数字，累加。
	 * 困难：关键问题在于如何存储计算的结果,long或double不能胜任,
	 * 即使64位的存储器最大值就是2^64，求助于java.math.BigNumber类。
	 * 初始化一个BigNumer不能用普通方法，要用BigInteger a = BigInteger.valueOf(2);
	 * 其他运行方法只能用自身提供的，例如pow(1000),表示自身1000次方。
	 * 字符串转整数是行不通的，必须经历字符char-字符串String-整数Integer 参考
	 * http://hi.baidu.com/nova_xmu_fjut/blog/item/7ab0c832ba6ce845ac4b5f73.html
	 */
	public static long PE16() {
		long result = 0;
		BigInteger a = BigInteger.valueOf(2);
		BigInteger x = a.pow(1000);
		String str = x.toString();

		for (int i = 0; i < str.length(); i++) {
			result += Integer.valueOf(String.valueOf(str.charAt(i)));
		}
		return result;
	}

	/**
	 * 
	 * A Pythagorean triplet is a set of three natural numbers, a b c, for
	 * which, a2 + b2 = c2 For example, 32 + 42 = 9 + 16 = 25 = 52. There exists
	 * exactly one Pythagorean triplet for which a + b + c = 1000. Find the
	 * product abc.
	 */
	public static long PE09() {
		long result = 0;
		for (int i = 1; i < 1000; i++)
			for (int j = 1; j < 1000; j++)
				for (int k = 1; k < 1000; k++) {
					if ((i * i + j * j == k * k) && (i + j + k == 1000)) {
						result = i * j * k;
						System.out.print("i是" + i + "j是" + j + "k是" + k);
					}
				}
		return result;
	}

	/**
	 * Find the greatest product of five consecutive digits in the 1000-digit
	 * number. 思考：字符串，逐个位移去计算。 优化：看看未来第5位是否有0，凡是有0在中间的可以跳过中间9个字符窜
	 * 突然想起StringBuffer,
	 * 想需求char转换成int的方法，实际上想法是错的！8个位是不能转成16个位去理解的。要先变成字符串，再变成整数。
	 */

	public static long PE08() {
		long maxvalue = 0, tmpvalue = 0;
		StringBuffer str = new StringBuffer();
		str.append("73167176531330624919225119674426574742355349194934"
				+ "96983520312774506326239578318016984801869478851843"
				+ "85861560789112949495459501737958331952853208805511"
				+ "12540698747158523863050715693290963295227443043557"
				+ "66896648950445244523161731856403098711121722383113"
				+ "62229893423380308135336276614282806444486645238749"
				+ "30358907296290491560440772390713810515859307960866"
				+ "70172427121883998797908792274921901699720888093776"
				+ "65727333001053367881220235421809751254540594752243"
				+ "52584907711670556013604839586446706324415722155397"
				+ "53697817977846174064955149290862569321978468622482"
				+ "83972241375657056057490261407972968652414535100474"
				+ "82166370484403199890008895243450658541227588666881"
				+ "16427171479924442928230863465674813919123162824586"
				+ "17866458359124566529476545682848912883142607690042"
				+ "24219022671055626321111109370544217506941658960408"
				+ "07198403850962455444362981230987879927244284909188"
				+ "84580156166097919133875499200524063689912560717606"
				+ "05886116467109405077541002256983155200055935729725"
				+ "71636269561882670428252483600823257530420752963450");
		for (int i = 4; i < str.length(); i++) {
			tmpvalue = Integer.parseInt(String.valueOf(str.charAt(i - 4)))
					* Integer.parseInt(String.valueOf(str.charAt(i - 3)))
					* Integer.parseInt(String.valueOf(str.charAt(i - 2)))
					* Integer.parseInt(String.valueOf(str.charAt(i - 1)))
					* Integer.parseInt(String.valueOf(str.charAt(i)));
			if (tmpvalue > maxvalue) {
				maxvalue = tmpvalue;
			}
		}
		return maxvalue;
	}

	/**
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can
	 * see that the 6th prime is 13. What is the 10001st prime number?
	 * 题意：寻找第10001个质数
	 * 
	 * @param long
	 *            a
	 * @return true/false
	 */
	public static int PE07() {
		int a = 0;
		long j = 0;
		for (a = 1; a <= Long.MAX_VALUE; a++) {
			if (isPrime(a))
				if (++j == 10001)
					break;
		}
		return a;
	}

	/**
	 * 判断是否质数prime
	 */
	public static boolean isPrime(int n) {
		int r = 0;
		if (n == 1)
			return false; // 1非质数。
		else if (n < 4)
			return true; // 2,3是质数。
		else if (n % 2 == 0)
			return false; // 偶数非质数。
		else if (n < 9)
			return true; // 排除了1，2，3，4，6，8，剩下的5，7是质数。
		else if (n % 3 == 0)
			return false; // 被3整除也非质数。
		else {
			r = (int) Math.floor(Math.sqrt(n));
			int f = 5;
			while (f <= r) {
				if (n % f == 0)
					return false;
				if (n % (f + 2) == 0)
					return false;
				f = f + 6;
			}
			return true;
		}
	}

	/**
	 * A palindromic number reads the same both ways. The largest palindrome
	 * made from the product of two 2-digit numbers is 9009 = 91 99. Find the
	 * largest palindrome made from the product of two 3-digit numbers.
	 * 寻找3位数相乘后最大的回文数。 思路：从100循环乘到999；将结果按位拆分并且回文组合比较。 按位取对数。
	 */
	public static long PE04() {
		long x = 0;
		long r = 0;
		for (int m = 100; m < 1000; m++) {
			for (int l = 100; l < 1000; l++) {
				x = m * l;
				if (isPalindromicNumber(x) && x > r) {
					r = x;
				}
			}
		}
		return r;
	}

	/**
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
	 * factor of the number 600851475143 ?
	 */
	public static void PE03() {
		long i;
		double n = 6.00851475143E11;

		for (i = 2; i * i <= n;) {
			if (n % i == 0) {
				System.out.print(i + "\n");
				n /= i;
			} else
				i++;
		}
		System.out.print(n + "\n");
	}

	// 1,2,3,4,5,6,7,8,9,10...

	public static int PE05() {
		int c = 1;
		for (int i = 2; i < 20; i++) {
			c = c * i / MaxDivid(c, i);
		}
		return c;
	}

	/**
	 * 
	 * 最大公约数
	 * 
	 * @param int
	 *            a, int b
	 * @return int 最大公约数
	 */
	public static int MaxDivid(int m, int n) {
		while (true) {
			if ((m = m % n) == 0)
				return n;
			if ((n = n % m) == 0)
				return m;
		}
	}

	/**
	 * 
	 * 最大公约数 辗转相除法。
	 * 
	 * @param int
	 *            a, int b
	 * @return int 最大公约数
	 */
	public static int MaxDivid2(int m, int n) {
		int r;
		while (n != 0) {
			r = m % n;
			m = n;
			n = r;
		}
		return m;
	}

	public static String PE06() {
		double sum1 = 0;
		double sum2 = 5050;
		for (int i = 1; i <= 100; i++) {
			sum1 = sum1 + Math.pow(i, 2);
		}
		DecimalFormat df = new DecimalFormat("#");
		return df.format(Math.pow(sum2, 2) - sum1);
	}

	public static int PE01() {
		int x = 0;
		for (int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				x = x + i;
			}
		}
		return x;
	}

	/**
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	 * 
	 * @return
	 */
	public static long PE02() {
		long x = 0;
		long a = 1;
		long b = 2;
		while (x < 4000000) {
			if (a % 2 == 0) {
				x = x + a;
			} else if (b % 2 == 0)
				x = x + b;
			a = a + b;
			b = a + b;
		}
		return x;
	}

	/**
	 * 是否回文数字
	 * 
	 * @param long
	 *            m
	 * @return ture/false
	 */
	public static boolean isPalindromicNumber(long m) {
		long n = (long) Math.floor(Math.log10(m));
		long y = 0;
		long x = m;
		for (long i = n, j = 0; i >= 0; i--, j++) {
			long a = 0;
			a = (long) Math.floor(x / Math.pow(10, i));
			y = y + (int) Math.floor(a * Math.pow(10, j));
			x = x - a * (long) Math.round(Math.pow(10, i));
		}
		if (m == y) {
			return true;
		}
		return false;
	}
}
