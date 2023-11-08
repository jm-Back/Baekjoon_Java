package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		double [] arr = new double[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		
		Stack<Double> stack = new Stack<>();
		
		double result = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c < 'A' || c > 'Z') { //연산자라면
				double p1 = stack.pop();
				double p2 = stack.pop();
				
				if(c=='+') {
					result = p2 + p1;
				} else if(c=='-') {
					result = p2 - p1;
				} else if(c=='*') {
					result = p2 * p1;
				} else if(c=='/') {
					result = p2 / p1;
				}
				
				stack.push(result);
				
			} else { //피연산자라면 
				stack.push(arr[s.charAt(i)-'A']);
			}
		}
		
		System.out.printf("%.2f",stack.pop());
		
	}

}
