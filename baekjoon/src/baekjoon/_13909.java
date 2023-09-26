package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _13909 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for ( int i = 1; i * i <=n; i++ ) {
			//System.out.println(i + " i ? ");
			//System.out.println(i * i + " <= "+ n + " :  i * i <=n ");
			
			count++;
		}
		
		System.out.println(count);
		
		
	}

}
