package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
public class _17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack = new Stack<>();
 
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
 
            if(s.charAt(i)=='<'){
                sb.append(s.charAt(i));
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(j)=='>'){
                        i = j;
                        sb.append(">");
                        break;
                    } else {
                        sb.append(s.charAt(j));
                    }
                }
            } else {
                if(s.charAt(i)!=' '){
                    stack.push(s.charAt(i));
                } else if(s.charAt(i)==' '){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                    sb.append(s.charAt(i));
                }
 
                //마지막.
                if(s.length()==i+1 || s.charAt(i+1)=='<'){
                    while(!stack.isEmpty()){
                        sb.append(stack.pop());
                    }
                }
            }
        }
        System.out.println(sb);
    }
}