package Problems61_70;
import java.util.*;
import java.io.*;
public class P67 {

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long[][] row = new long[100][100];
		for(int i = 0; i < row.length; i++) {
			StringTokenizer f = new StringTokenizer(in.readLine());
			for(int j = 0; j < i+1; j++) {
				row[i][j] = Integer.parseInt(f.nextToken());
				long max = 0;
				if(i>0) max = row[i-1][j];
				if(i>0&&j>0) max = Math.max(row[i-1][j-1], max);
				row[i][j]+=max;
			}
			
		}
		long max = 0;
		for(int i = 0; i < 100; i++) max = Math.max(max, row[99][i]);
		System.out.println(max);
	}

}
