package baekjoon;

import java.io.*;
import java.util.*;
 
 
/**
 * 좌표 압축
 * n개의 좌표 가 있는데, 좌표에 좌표 압축을 적용하려고 한다.
 * xi 좌표 합축의 결과, xi' 의 값은 xi>xj 를 만족하는 서로 다른 좌표 xj의 개수와 같아야한다.
 * x1,x2...xn의 좌표 압축 결과 x1', x2',..xn'를 출력하자.
 *
 */
public class _18870 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
 
        //좌표 압축이란?
        /*
            수의 범위가 매우 큰 상태에서 수의 값과 상관 없이 숫자의 대소관계만 알면 될 때 이용하는 알고리즘이다.
         */
        Map<Integer,Integer> map = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
        int origin_arr[] = new int[n];
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            origin_arr[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
 
        //정렬
        Arrays.sort(arr);
 
        //중복x -> treemap에 저장
        int tmp;
        int idx = 0;
        for(int num : arr){
            if(!map.containsKey(num)){
                map.put(num, idx++);
            }
        }
 
        for(int num : origin_arr){
            bw.write(map.get(num) + " ");
        }
 
        bw.flush();
        bw.close();
    }
}