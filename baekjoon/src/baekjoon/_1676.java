package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 구한 0의 개수를 출력한다.
 *
 * 뒷자리에 0이 나오는 경우는 2와 5가 곱해진 때, 즉, 10이 곱해진 경우이다.
 * 소인수분해를 해보면, 2와 5가 존재하는 경우 뒷자리가 0으로 끝난다.
 *
 * 뒷자리에 0이 n개 있는 것은, 2와 5가 n개씩 짝지어 존재한다는 의미다.
 * 팩토리얼에서 25~30 팩토리얼은 0의 개수가 5의 개수만큼 증가함을 알 수 있다.
 * 즉, 5의 배수마다 팩토리얼이 증가한다고 보면 되어 문제에서 5의 배수를 고려한다.
 *
 *
 */
public class _1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
 
        //뒷자리에 0이 나오는 경우- 2 와 5가 곱해졌을 때.
        //=소인수분해해서 2와 5개 존재할 경우 뒷자리는 0으로 끝남을 알 수 있다.
 
        int count =0;
        while(n>=5){
            count+= n/5;
            n /= 5;
        }
 
        System.out.println(count);
 
 
    }
}