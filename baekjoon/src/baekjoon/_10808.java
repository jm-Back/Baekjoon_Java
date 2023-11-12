package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 *
 * baekjoon
 *
 *
 */
public class _10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String s = br.readLine();
        int[] arr = new int[26]; //소문자 개수
 
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-97]++;
        }
 
        StringBuilder sb = new StringBuilder();
        for(int j : arr){
            sb.append(j).append(" ");
        }
        System.out.println(sb);
 
    }
}