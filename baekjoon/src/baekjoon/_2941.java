package baekjoon;

import java.io.IOException;
import java.util.*;
 
/**
 * 2941번 풀이
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *  dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 *
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 */
public class _2941 {
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
 
        String word = sc.next();
 
        HashMap<String, Integer> map = new LinkedHashMap<>();
 
        map.put("c=", 1);
        map.put("c-", 2);
        map.put("dz=", 3);
        map.put("d-", 4);
        map.put("lj", 5);
        map.put("nj", 6);
        map.put("s=", 7);
        map.put("z=", 8);
 
        for ( String key : map.keySet() ){
            if ( word.contains(key)){
                word = word.replaceAll(key, "o");
//                System.out.println(key + " ! ");
//                System.out.println("word 는? " + word);
            }
        }
        System.out.println(word.length());
 
        sc.close();
    }
}