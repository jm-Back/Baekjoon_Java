package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
 
/**
 * 괄호.
 * 괄호 문자열 = '(' , ')' 만으로 구성되는 문자열이다.
 * 괄호 모양이 바른 것 = 올바른 괄호 문자열 (vps)
 * 한 쌍의 괄호 기호로된 문자열 "()" : 기본 vps
 * x가 vps 라면 "(x)" 문자열도 vps 가 된다.
 * 그리고 두 vps x와 y 를 접합 시킨 문자열 xy 도 vps 가 된다. (vps + vps => vps)
 * 입력으로 주어진 괄호 문자열이 vps 인가 판단하는 yes, no 프로그램을 만드시오.
 */
public class _9012 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCaseCount = Integer.parseInt(br.readLine());
 
        for ( int i = 0; i < testCaseCount; i++ ){
            System.out.println(searchBracket(br.readLine()));
        }
    }
 
    public static String searchBracket(String word) {
        Stack<Character> stack = new Stack<>();
 
        for ( int i = 0; i < word.length(); i++ ){
            char c = word.charAt(i);
 
            if(c=='('){
                stack.push(c);
            } else if (stack.empty()){
                return "NO";
            } else {
                stack.pop();
            }
        }
 
        if(stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
 
    }
}