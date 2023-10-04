package baekjoon;

import java.util.Scanner;
import java.util.Stack;

/**
 * 10773번 - 제로
 * 재현이가 재민이의 장부 관리를 돕는데,
 * 재현이가 잘못된 수를 부를 때 마다 0을 외쳐서, 가장 최근에 재민이가 쓴 수를 지우게 시킨다.
 * 재민이는 모든 수를 받아 적은 후, 그 수의 합을 구하고 싶어한다.
 */
public class _10773 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        Stack<Integer> jemin = new Stack<>();

        //정수 1개씩 찍기
        for ( int i = 0; i < k; i++ ){
            int nextInt = sc.nextInt();

            if ( nextInt == 0 ) {
                jemin.pop();
            } else {
                jemin.push(nextInt);
            }

        }

        int sum = 0;
        for ( int num : jemin ){
            sum += num;
        }
        System.out.println(sum);

        sc.close();

    }
}