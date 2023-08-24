package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class dsfs {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<Integer, String> map = new HashMap<>();
		
		for ( int i = 0; i < n; i++ ) 
		{
			map.put(i+1, br.readLine());
		}
		
		String quiz = br.readLine();
		
		if ( map.containsValue(quiz)) {
			System.out.println("예아");
		}
		
	}

}
