package baekjoon;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * ROT13은 카이사르 암호의 일종으로 영어 알파벳을 13글자씩 밀어서 만든다.
 *  암호화한 내용을 원래 내용으로 바꾸려면 암호화한 문자열을 다시 ROT13하면 된다.
 *  ROT13은 알파벳 대문자와 소문자에만 적용할 수 있다.
 *
 *  알파벳이 아닌 글자는 원래 글자 그대로 남아 있어야 한다.
 *  문자열이 주어졌을 때, "ROT13"으로 암호화한 다음 출력하는 프로그램을 작성하시오.
 *
 *  Baekjoon Online Judge
 *  -> Onrxwbba Bayvar Whqtr
 *
 */
public class _11655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
 
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            //알파벳이면, 13글자 밀어냄.
            if (c >= 'A' && c <= 'Z') {
                char c_new = (char) (c + 13);
                if (c_new > 'Z') {
                    sb.append((char)(c_new - 26));
                } else {
                    sb.append(c_new);
                }
            } else if(c >= 'a' && c <= 'z'){
                char c_new = (char) (c + 13);
                if (c_new > 'z') {
                    sb.append((char) (c_new - 26));
                } else {
                    sb.append(c_new);
                }
            } else {
                sb.append(c);
            }
        }
 
        System.out.println(sb);
 
    }
}