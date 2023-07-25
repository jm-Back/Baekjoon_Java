package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
 
/**
 * 25206번 - 너의 평점은
 * 치훈이의 전공평점을 계산해주는 프로그램을 작성해보자.
 *  전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값이다.
 *  - 등급에 따른 과목평점은 다음 표와 같다. (그림)
 *  - P/F 과목의 경우 등급이 P또는 F로 표시되는데, 등급이 P인 과목은 계산에서 제외해야 한다.
 *
 *  입력 : 20줄에 걸쳐 치훈이가 수강한 전공과목의 과목명, 학점, 등급이 공백으로 구분되어 주어진다.
 *  출력 : 치훈이의 전공평점을 출력한다.
 *  제한 : 1 ≤ 과목명의 길이 ≤ 50
 *  과목명은 알파벳 대소문자 또는 숫자로만 이루어져 있으며, 띄어쓰기 없이 주어진다.
 *  학점은 1.0,2.0,3.0,4.0중 하나이다.
 *  등급은 A+,A0,B+,B0,C+,C0,D+,D0,F,P중 하나이다.
 *  적어도 한 과목은 등급이 P가 아님이 보장된다.
 */
public class _25206 {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        HashMap<String, Double> avg = new HashMap<String, Double>();
 
        avg.put("A+", 4.5);
        avg.put("A0", 4.0);
        avg.put("B+", 3.5);
        avg.put("B0", 3.0);
        avg.put("C+", 2.5);
        avg.put("C0", 2.0);
        avg.put("D+", 1.5);
        avg.put("D0", 1.0);
        avg.put("F",  0.0);
 
        double classSum = 0.0;
        double totalSum = 0.0;
 
        for ( int i = 0; i < 20; i++ )
        {
            String[] score = br.readLine().split(" ");
            double hak = Double.parseDouble(score[1]);
            String grade = score[2];
 
            if ( grade.equals("P")) continue;
            classSum += hak * avg.get(grade);
            totalSum += hak;
        }
 
        System.out.println(classSum / totalSum);
 
    }
}