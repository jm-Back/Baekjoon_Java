package baekjoon;

import java.util.Scanner;
 
/**
 * A+B - 4
 * @author Back
 *
 */
public class _10951 {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNextInt()){
		
			int a = sc.nextInt();
			int b = sc.nextInt();
		
			System.out.println(a+b);
		}
	}
}