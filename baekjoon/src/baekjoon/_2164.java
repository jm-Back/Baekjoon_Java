package baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
 
public class _2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int n = Integer.parseInt(br.readLine());
 
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }
 
        while(queue.size()>1){
            //1.제일 위를 버린다.
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }
}