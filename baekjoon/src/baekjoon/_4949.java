package baekjoon;

import java.io.*;
import java.util.Stack;
 
public class _4949 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
 
        while(true){
            stack.clear();
            String words = br.readLine();
            if(words.equals(".")){
                break;
            }
 
            for(int i=0; i<words.length(); i++){
                char temp = words.charAt(i);
 
                if(temp =='(' || temp =='['){
                    stack.push(temp);
                } else if(temp==')' || temp ==']') {
                    if(stack.isEmpty() || (stack.peek() == '(' && temp == ']') || (stack.peek()=='[' && temp==')') ){
                        stack.push(temp);
                        break;
                    }
                    stack.pop();
                }
            }
 
            if(!stack.isEmpty()){
                bw.write("no"+"\n");
            } else {
                bw.write("yes"+"\n");
            }
 
            bw.flush();
        }
 
        bw.close();
    }
}