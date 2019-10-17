package dp;

public class EditDistance {
	
	

	 public int minDistance(String word1, String word2) {
		 
		 int n = word1.length();
		 int m = word2.length();
		 
		 if( n*m == 0)
			 return n + m;
		 
		 int[][] dp = new int[n+1][m+1]; 
		 
		 for (int i = 0; i < n+1; i++) {
			dp[i][0] = i;
		}
		 
		 for (int j = 0; j < m; j++) {
			dp[0][j] = j;
		}
		 
		 
		 for(int i =0; i < n;i++){
			 for(int j =0;j < m;j++) {
				 if(word1.charAt(i) == word2.charAt(j)){
					 dp[i+1][j+1] = dp[i][j];
				 }
				 else {
					 dp[i+1][j+1] = Math.min(dp[i][j], Math.min(dp[i][j+1], dp[i+1][j]))+1;
				 }
			 }
		 }
		 
		 return dp[n][m];
	 }
	 
}
