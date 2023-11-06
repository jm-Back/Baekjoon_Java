package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _17298 {
	public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int [] result = new int[n];
        Stack<Integer> stack = new Stack<>();
 
        //수열의 원소가 들어간다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            result[i] = -1;
        }
        
        StringBuilder sb = new StringBuilder();
 
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
                result[stack.pop()] = arr[i];
            }
            stack.add(i); //처음에 비어있는 stack 에서는 첫번째 원소의 인덱스 0을 넣어준다.
        }
 
        for(int j : result){
            sb.append(j).append(" ");
        }
        System.out.println(sb);
 
    }
}