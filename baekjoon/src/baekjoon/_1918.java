package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
/**
 * 후위 표기식
 * 1. 연산자 우선순위로 괄호로 묶는다.
 * 2. 괄호 안의 연산자를 괄호의 오른쪽으로 옮긴다.
 * 중위 표기식을 후위 표기식으로 고치는 프로그램을 작성하시오.
 *
 */
public class _1918 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //A+B*C  ---->   ABC*+
        
        Stack<Character> op = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
 
            if(c>='A' && c<='Z'){ //피연산자는 그대로 출력
                sb.append(c);
            } else if(c=='(') {
                op.push(c);
            } else if(c==')') {
                while(!op.isEmpty()){
                    if(op.peek()=='('){ //(가 나올 때 까지 pop
                        op.pop();
                        break;
                    }
                    sb.append(op.pop());
                }
            } else {
                while(!op.isEmpty() && priority(op.peek()) >= priority(c)){
                    sb.append(op.pop());
                }
                op.push(c);
            }
        }
 
        while(!op.isEmpty()){
            sb.append(op.pop());
        }
 
        System.out.println(sb);
 
    }
    public static int priority(char t){
        if(t =='*' || t =='/') return 2;
        else if (t == '(') return 0;
        else return 1;
    }
 
}