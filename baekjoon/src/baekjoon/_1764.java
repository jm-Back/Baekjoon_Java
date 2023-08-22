package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
/**
 * 1764 -
 * 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과
 * N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
 * 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다.
 *
 * 듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
 * //카운트 수 + 이름을 사전순으로 출력한다.
 *
 * 1. 들어보지 못한 사람 과 보지도 못한 사람 둘 다에 해당되는 사람 출력.
 */
public class _1764 {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int n = Integer.parseInt(st.nextToken()); //못본사람
        int m = Integer.parseInt(st.nextToken()); //못들은사람
 
        HashMap<String, String> map = new HashMap<>();
 
        String not_see = "";
        String not_heard = "";
 
        for ( int i = 0; i < n; i++ ){
            not_see = br.readLine();
            map.put(not_see, not_see);
        }
 
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();
 
        int count = 0;
        for ( int i = 0; i < m; i++ ){
            not_heard = br.readLine();
            if ( map.containsKey(not_heard) ){
                count++;
                list.add(not_heard);
            }
        }
 
        Collections.sort(list);
 
        System.out.println(count);
 
        for ( int i = 0; i < list.size(); i++ ){
            sb.append(list.get(i) + "\n");
        }
        System.out.println(sb.toString());
 
    }
}