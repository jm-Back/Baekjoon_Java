package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
 
/**
 * 오등큰수
 *
 **/
public class _17299 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
 
        int [] arr = new int[n];
        int [] cnt = new int[1000001];
        int [] result = new int[n];
        Stack<Integer> stack = new Stack<>();
 
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            cnt[arr[i]]++;
        }

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && cnt[arr[stack.peek()]] < cnt[arr[i]] ){
                result[stack.pop()] = arr[i];
            }
            stack.add(i);
        }
  
        while (!stack.empty()){
            result[stack.pop()] = -1;
        }
 
        StringBuilder sb = new StringBuilder();
        for(int j : result){
            sb.append(j).append(" ");
        }
        System.out.println(sb);
 
    }
}
