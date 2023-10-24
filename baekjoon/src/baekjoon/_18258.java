package baekjoon;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
/**
 * 정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
 *
 * 명령은 총 여섯 가지이다.
 *
 * push X: 정수 X를 큐에 넣는 연산이다.
 * pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * size: 큐에 들어있는 정수의 개수를 출력한다.
 * empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
 * front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
public class _18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
 
        int n = Integer.parseInt(br.readLine());
        int back = 0;
        Deque<Integer> q = new LinkedList<>();
 
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
 
            if(order.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                q.add(x);
                back = x;
            } else if (order.equals("pop")){
                if(!q.isEmpty()){
                    sb.append(q.poll()+"\n");
                } else {
                    sb.append(-1+"\n");
                }
            } else if (order.equals("size")) {
                sb.append(q.size()+"\n");
            } else if (order.equals("empty")) {
                if(!q.isEmpty()){
                    sb.append(0+"\n");
                } else {
                    sb.append(1+"\n");
                }
            } else if (order.equals("front")) {
                if(!q.isEmpty()){
                    sb.append(q.peek()+"\n");
                } else {
                    sb.append(-1+"\n");
                }
            } else if (order.equals("back")) {
                if(!q.isEmpty()){
                    sb.append(back+"\n");
                } else {
                    sb.append(-1+"\n");
                }
            }
        }
 
        bw.write(sb.toString());
        bw.close();
 
    }
}