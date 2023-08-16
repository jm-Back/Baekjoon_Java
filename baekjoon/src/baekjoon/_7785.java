package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
/**
 * 7785번 - 회사에 있는 사람
 * 첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다.
 * 다음 n개의 줄에는 출입 기록이 순서대로 주어진다.
 *
 * 요구 : 현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력한다.
**/
public class _7785 {
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> map = new HashMap<>();
 
        for ( int i =0; i < n; i++ ){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
 
        StringBuilder sb = new StringBuilder();
 
        List<String> list = new ArrayList<>();
        for ( String key_name : map.keySet()){
            if ( map.get(key_name).equals("enter")){
                list.add(key_name);
            }
        }
 
        list.sort(Comparator.reverseOrder());
 
        for ( int i= 0; i < list.size(); i++ ){
            sb.append(list.get(i) + "\n");
        }
 
        System.out.println(sb.toString());
    }
}