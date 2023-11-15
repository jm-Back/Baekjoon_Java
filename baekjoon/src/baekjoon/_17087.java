package baekjoon;

import java.util.Scanner;

/**
 * 숨바꼭질 6
 * 수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.
 *
 * 수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다. 수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.
 *
 * 모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.
 *
 */
public class _17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int s = sc.nextInt();
 
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Math.abs(s-sc.nextInt());
        }
 
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(i==0) result = gcd(0, arr[i]);
            else {
                result = gcd(result, arr[i]);
            }
        }
 
        System.out.println(result);
 
        sc.close();
 
    }
 
    public static int gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            a = b;
            b = r;
        }
 
        return a;
    }
}