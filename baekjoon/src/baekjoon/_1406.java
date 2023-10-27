package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
 
public class _1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String s = br.readLine(); //abcd
        int idx = s.length(); //처음, 맨 뒤
 
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();
 
        for(int i=0; i<s.length(); i++){
            leftStack.add(s.charAt(i));
        }
 
        int cnt = Integer.parseInt(br.readLine()); //3
        StringTokenizer st;
        //명령 실행.
        for(int i=0; i < cnt; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String order = st.nextToken();
            if(order.equals("L")){
                if(!leftStack.isEmpty()){
                    rightStack.push(leftStack.pop()); //꺼내서 오른쪽으로 둠
                }
            } else if(order.equals("D")){
                if(!rightStack.isEmpty()){
                    leftStack.push(rightStack.pop()); //꺼내서 왼쪽으로 다시.
                }
            } else if(order.equals("B")){ //왼쪽꺼 삭제
                if(!leftStack.isEmpty()){
                    leftStack.pop();
                }
            } else if(order.equals("P")){ //문자를 커서에 추가
                char word = st.nextToken().charAt(0);
                leftStack.push(word);
            }
        }
 
        StringBuilder sb = new StringBuilder();
 
        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }
        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }
        System.out.println(sb);
 
    }
}