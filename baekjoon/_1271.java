package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class _1271 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n,m;
        n = sc.nextBigInteger();
        m = sc.nextBigInteger();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
        // BigInteger은 /, % 연산을 사용할 수 없음 (divide, remainder 사용)
    }
}
