package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
/**
 * 10989번 풀이 - 수 정렬하기 3
 * 카운팅 소트 !
 *
**/
public class _10989 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int [] result = new int[n];
 
        int max = -1;
 
        for ( int i =0; i < n; i++ ){
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max){
                max = arr[i];
            }
        }
 
        //소트용 카운팅 배열(max+1)에 카운팅
        int [] sorted = new int[max+1];
 
        for ( int i =0; i < arr.length; i++ ){
            sorted[arr[i]]++;
        }
 
        //누적합 구하기
        for ( int i =1; i < sorted.length; i++ ){
            sorted[i] += sorted[i-1];
        }
 
        //결과 배열 생성 및 값 찾아 넣기
        //역순으로 가져오기.
        //그 값으로 --counting 자리번호 찾음
        for ( int i = arr.length - 1; i >= 0; i-- ){
            int num = arr[i];
            result[--sorted[num]] = num;
        }
 
        StringBuilder sb = new StringBuilder();
 
        for ( int i = 0; i < result.length; i++ ){
            sb.append(result[i]+"\n");
        }
 
        System.out.println(sb.toString());
    }
}