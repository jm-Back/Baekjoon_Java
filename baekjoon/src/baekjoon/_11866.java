package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
/**
 * 요세푸스 문제 0
 * n명의 사람이 원을 이루며 앉았다. 양의 정수 k(<=n)가 주어진다.
 * 순서대로 k번째 사람을 제거한다.
 * 한 사람이 제거되면, 남은 사람들로 이뤄진 원을 따라 이 과정이 반복된다.
 * n명의 사람이 모두 제거될 때 까지 반복된다.
 * 원에서 사람들이 제거되는 순서를 (n,k)-요세푸스 순열 이라고 한다.
 *
 * 예를 들어 (7,3)-요세푸스 순열은
 * <3,6,2,7,5,1,4> 이다.
 */
public class _11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        Queue<Integer> q = new LinkedList<>();
 
        for(int i=1; i<=n; i++){
            q.add(i);
        }
 
        StringBuilder sb = new StringBuilder();
        /**
         * 큐는 뒤로 삽입이 가능하기 때문에,
         * 뽑을 숫자가 아니면 다시 뒤로 넣고 찾는 숫자만 뽑는다.
         */
        sb.append("<");
        while(q.size()>1){
            for(int i=0; i<k-1; i++){
                int tmp = q.poll();
                q.add(tmp);
            }
            int num = q.poll();
            sb.append(num+", ");
        }
        int num = q.poll();
        sb.append(num).append(">");
 
        System.out.println(sb.toString());
    }
}