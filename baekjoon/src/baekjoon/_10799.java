package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/** 
 * 쇠막대기 
 * 쇠막대기를 편하게 자르기 위해 아래에서 위로 겁쳐 놓고, 레이저를 위에서 수직으로 발사해서 
 * 쇠막대기를 자르려고 한다. 
 * 1. 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓을 수 있다. 
 * 위에 놓는 경우 완전히 포함되도록 놓되, 끝점은 겹치지 않도록 놓는다. 
 * 2. 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다. 
 * 3. 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다. 
 * 
 * 레이저는 () 을 표현한다. 
 * 
 * 쇠막대기는 ( 여는 괄호와 ) 닫는 괄호로 표현한다. 
 * 
 * 쇠막대기와 레이저 배치를 나타내는 괄호가 주어졌을 때,
 * 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오. 
 * 
 */
public class _10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String problem = br.readLine();
		
		//(자르기!) -> stack size 값 3 개 짝둑. (3)
		//(자르기!) -> stack size 값 3개 짝둑. (6)
		// ")" -> 1개 잘린 조각 획득. (stack -> 2) 됨 (7) 
		// "(" -> 새로 들어옴. stack size 3개 됨 
		//(자르기!) -> stack size 값 3개 짝둑! (10)
		//")" -> 1개 잘린 조각 획득. (stack -> 2) 됨 (11)
		//(자르기!) -> stack size 값 2개 짝둑 (13)
		//")" -> 1개 잘린 조각 획득 (stack -> 1) 됨 (14)
		//")" -> 1개 잘린 조각 획득 (stack -> 0) 됨 (15)
		// --|-- -> 조각 2개 획득. 
		
		// 1. 레이저 -> 자르기.
		// 2. ( -> stack 에 넣기. 
		// 3. ) -> stack 에서 빼고, 잘린 조각 추가. 
		
		
		Stack<Character> stack = new Stack<>();
		int count = 0;
		for(int i=0; i<problem.length(); i++) {
			char c = problem.charAt(i);

			if(c=='(') {
				if(problem.charAt(i+1)==')') {
					if(!stack.isEmpty()) {
						count += stack.size();
					} else {
						count += 0;
					}
					i++; //건너뜀.
				} else {
					stack.push(c);
				}
				
			} else if (c==')') {
				count += 1;
				stack.pop();
			}
			
		}
		
		
		System.out.println(count);
		
		
		
	}

}
