package baekjoon;

import java.util.Scanner;
 
/**
 * 2839번 풀이 - 설탕 배달
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다.
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다. (3 or 5)
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다.
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 */
public class _2839 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int count = 0;
 
        //최소 봉지 개수를 출력하라. 정확한 N킬로그램을 만들 수 없으면 -1을 출력하라.
        while ( true ){
 
            if ( n%5 == 0 )
            {
                System.out.println(n/5 + count);
                break;
            }
            else if ( n < 0 )
            {
                System.out.println(-1);
                break;
            }
            n -= 3;
            count++;
        }
 
        sc.close();
    }
}