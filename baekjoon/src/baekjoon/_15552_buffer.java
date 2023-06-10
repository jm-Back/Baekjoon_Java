package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 빠른 A+B
 * 버퍼 리더 사용하기 
 */
public class _15552_buffer {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 0;
		String[] strs;

		for ( int i = 0; i < n; i ++)
		{
			strs = br.readLine().split(" ");
			a = Integer.parseInt(strs[0]);
			b = Integer.parseInt(strs[1]);
			
			bw.write(a+b+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
