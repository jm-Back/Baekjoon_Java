package baekjoon;

import java.io.*;
import java.util.*;
 
public class _9093 {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
 
        for(int i=0; i<t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                String n = st.nextToken();
                Stack<Character> stack = new Stack<>();
                for(int j=0; j<n.length(); j++){
                    stack.push(n.charAt(j));
                }
 
                while(!stack.isEmpty()){
                    bw.write(stack.pop());
                }
 
                bw.write(" ");
 
                bw.flush();
            }
        }
    }
}