package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _12789 {

    public static void main(String[] args) throws IOException {
        //대기열의 왼쪽에 1열로 설 수 있는 공간 존재.
        //맨 앞 사람만 이동이 가능하다.
        //한 사람씩 (맨 앞 사람씩 1열로 줄 서는 공간 o)
        // if ) 5 4 1 3 2
        // 1  |  5 4 | 3 2
        // 2  |  5 4 3
        // 3  |  5 4
        // 4  |  5
        // 5  |

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<arr.length; i++){
        	int token = Integer.parseInt(st.nextToken());
        	arr[i] = token;
        } 

        int number = 0;
        Stack<Integer> stack = new Stack<>();
        
        while(number<n) {
        	number++;
        	//(1)스택에서 먼저 맨 처음값 체크. 있으면 꺼내버리기. 
        	if(!stack.isEmpty()) {
        		if(stack.peek().equals(number)) {
        			stack.pop(); //꺼내기.
        			continue;
        		}
        	}
        	
        	//(2)두번째로 배열값 체크!
    		for(int i=0; i<arr.length;i++) {
    			if(arr[i] != 0 && arr[i] != number) { //스택에 들어간 값이 아닐때, 
    				stack.push(arr[i]); //스택에 넣고 
    				arr[i] = 0; //초기화.
    			} else if (arr[i] == number) {
    				arr[i] = 0;
    				break;
    			}
    		}
        }
        
        if(stack.isEmpty()) {
        	bw.write("Nice");
        } else {
        	bw.write("Sad");
        }
        
        bw.flush();
        bw.close();

    }
}