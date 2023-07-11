package baekjoon;

import java.util.Scanner;

/**
 * 직사각형에서 탈출
 * 1085번 풀이
 * 현수가 (x,y) 좌표에 있다. 직사각형은 각 변이 좌표축에 평행하고 왼쪽 아래 꼭지점은 (0,0)
 * 오른쪽 위 꼭지점은 (w,h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하라
 * 1. x, y, w, h 가 주어진다. 
 * 
 */
public class _1085 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
 
        int min = 10000;
 
        if ( min > Math.abs(0-x) )
        {
            min = Math.abs(0-x);
        }
 
        if ( min > Math.abs(0-y) )
        {
            min = Math.abs(0-y);
        }
 
        if ( min > Math.abs(w-x) )
        {
            min = Math.abs(w-x);
        }
 
        if ( min > Math.abs(h-y) )
        {
            min = Math.abs(h-y);
        }
 
        System.out.println(min);
 
        sc.close();
 
    }
}