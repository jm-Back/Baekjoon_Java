package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 골드바흐의 추측
 * - 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
 * 입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.
 * 각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000) //짝수 !
 * 입력 마지막은 0이 주어진다.
 *
 * 만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다.
 * 또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
 *
 */
public class _6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int [] arr = new int[1000001];
        //소수 배열을 만든다.
        makingPrimeArr(arr);
 
        int num;
        while((num=Integer.parseInt(br.readLine()))!=0){
            boolean flag = false;
 
            for(int i=2; i<=num/2; i++){ //절반 까지(절반 이상 넘어가면 의미x)
                if(arr[i]!=0 && arr[num-i]!=0) { //둘 다 소수일 때, 출력 후 탈출
                    flag = true;
                    System.out.println(num + " = " + arr[i] + " + " + arr[num-i]);
                    break;
                }
            }
 
            if(!flag){
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
 
    public static void makingPrimeArr(int[] arr){
        try {
            for(int i=0; i<=1000000; i++){
                arr[i] = i;
            }
 
            for(int i=2; i<Math.sqrt(1000000); i++){ //제곱근 까지만 하기.(절반)
                if(arr[i]==0) continue;
 
                for(int j=i+i; j<=1000000; j+= i){
                    arr[j] = 0;   //배수가 되는 것들은, 모두 0 처리.
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}